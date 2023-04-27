/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            System.out.println("1.Dodaj nowego studenta");
            System.out.println("2.Wyświetl listę studentów");
            System.out.println("3.Wyszukaj studenta po imieniu");
            System.out.println("0.Wyjście");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            Service s = new Service();

            switch (choose) {
                case 1:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Wprowadź imię studenta: ");
                    String imie1 = scanner2.nextLine();
                    System.out.println("Wprowadź nazwisko studenta: ");
                    String nazwisko = scanner2.nextLine();
                    System.out.println("Wprowadz wiek: ");
                    int wiek = scanner.nextInt();
                    System.out.println("Wprowadz datę urodzenia (w formacie dd-mm-yyyy): ");
                    String dataUrodzenia = scanner2.nextLine();
                    System.out.println("Wprowadz adres: ");
                    String adres = scanner2.nextLine();
                    s.addStudent(new Student(imie1, nazwisko, wiek, dataUrodzenia, adres));
                    break;
                case 2:
                    var students = s.getStudents();
                    for (Student current : students) {
                        System.out.println(current.ToString());
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Wprowadz imię studenta, którego chcesz wyszukac: ");
                    String imie2 = scanner3.nextLine();
                    var student = s.findStudentByName(imie2);
                    if (student == null) {
                        System.out.println("Nie znaleziono studenta o takim imieniu.");
                    } else {
                        System.out.println(student.ToString());
                    }
                    break;
                case 0:
                    System.out.println("Zamykanie :)");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        } catch (IOException e) {
            System.out.println("Błąd" +  e.getMessage());
        }
    }
}
