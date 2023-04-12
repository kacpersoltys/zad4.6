/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;

import org.hamcrest.StringDescription;
import org.junit.rules.ExternalResource;

import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
     System.out.println("1.Dodaj nowego studenta");
     System.out.println("0.Wyjście");
      Scanner scanner=new Scanner(System.in);
      int choose = scanner.nextInt();
      Service s = new Service();
     // s.addStudent(new Student("Krzysztof", 20));
      //s.addStudent(new Student("Janusz", 40));
      if (choose==1)
        {
        System.out.println("Wprowadź imię i nazwisko studenta: ");
        String imienazwisko = scanner.next();
        int wiek = scanner.next();   
        scanner.close();
        s.addStudent(new Student(imienazwisko, wiek ));
        }
      else if (choose==0)
        {
        System.out.println("Zamykanie :)");
        scanner.close();
        System.exit(0);
        }
      var imienazwisko = s.getStudents();
      for(Student current : imienazwisko) {
      System.out.println(current.ToString());
      }
    } catch (IOException e) {
      
    }
      }
}

  