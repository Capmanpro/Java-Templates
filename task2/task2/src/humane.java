import java.time.LocalDate;
public class humane {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    public humane(int age,String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.weight = weight;
        this.lastName = lastName;
    }

    public String toString() {
        return age + " " + " " + birthDate + " " + firstName + " " + weight + " " + lastName;
    }
}
