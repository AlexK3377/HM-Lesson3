import java.time.LocalDate;

public class Student extends Human {

    private String lastName;
    private RecordBook recordBook;

    public Student(String name,
                   String lastName,
                   LocalDate birthDate) {
        super(name, birthDate);
        this.lastName = lastName;
    }

    public void join(RecordBook recordBook) {
        this.recordBook = recordBook;
    }

    public void kick() {
        this.recordBook = null;
    }

    public RecordBook recordBook() {
        return this.recordBook;
    }

    public boolean identify(String lastName) {
        return this.lastName.equalsIgnoreCase(lastName);
    }

    public String lastName() {
        return this.lastName;
    }

    @Override
    public void say() {
        System.out.println("I am a student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                "recordBook=" + recordBook +
                "} " + super.toString();
    }
}
