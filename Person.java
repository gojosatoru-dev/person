import java.time.LocalDate;
import java.time.Period;

class Person {
    String name;
    LocalDate dob;

    public Person(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }
}
