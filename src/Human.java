import java.time.LocalDate;

public class Human {

    private String name;
    private LocalDate birthDate;

    public Human(String name,
                 LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Human(){
        super();
    }

    public void say() {
        System.out.println("I am a man");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}