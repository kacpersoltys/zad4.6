public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private String DateOfBirth;
  private String Address;
  
  public Student(String name, String surname, int age, String dateOfBirth, String address) {
    Name = name;
    Surname = surname;
    Age = age;
    DateOfBirth = dateOfBirth;
    Address = address;
  }

  public String GetName() {
    return Name;
  }
  public String Getname() {
    return Surname;
  }

  public int GetAge() {
    return Age;
  }

  public String GetDateOfBirth() {
    return DateOfBirth;
  }
  public String GetAddress() {
    return Address;
  }
  
  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + DateOfBirth + " " + Address;
  }

  public static Student Parse(String str) {
  String[] data = str.split(" ");
  if (data.length != 5) {
    return new Student("Parse Error", "Parse Error", -1, "Parse Error", "Parse Error");
  }
  return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
}
}