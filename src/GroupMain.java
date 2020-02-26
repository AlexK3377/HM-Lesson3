import java.time.LocalDate;

public class GroupMain {

    public static void main(String[] args) {

        Group group = new Group("Test");
        Student student1 = new Student("Alex", "A", LocalDate.parse("1984-01-01"));
        Student student2 = new Student("Alex", "B", LocalDate.parse("1984-02-01"));
        Student student3 = new Student("Alex", "C", LocalDate.parse("1984-03-01"));
        Student student4 = new Student("Alex", "D", LocalDate.parse("1984-04-01"));
        Student student5 = new Student("Alex", "E", LocalDate.parse("1984-05-01"));
        Student student6 = new Student("Alex", "F", LocalDate.parse("1984-06-01"));
        Student student7 = new Student("Alex", "G", LocalDate.parse("1984-07-01"));
        Student student8 = new Student("Alex", "H", LocalDate.parse("1984-08-01"));
        Student student9 = new Student("Alex", "I", LocalDate.parse("1984-09-01"));
        Student student10 = new Student("Alex", "J", LocalDate.parse("1984-10-01"));
        Student student11 = new Student("Alex", "K", LocalDate.parse("1984-11-01"));

        group.join(student1);
        group.join(student2);
        group.join(student3);
        group.join(student4);
        group.join(student5);
        group.join(student6);
        group.join(student7);
        group.join(student8);
        group.join(student9);
        group.join(student10);

//       group.join(student11);

        System.out.println(group);
        System.out.println();
        System.out.println(group.search("F"));

        System.out.println(group.kick(student3.recordBook()));
        System.out.println();
        System.out.println(group);
        System.out.println();

        group.join(student11);
        System.out.println();
        System.out.println(group);
        System.out.println();

        try {
            group.join(student3);
        } catch (GroupOverflowException e) {
            System.out.println("Student " + student3 + " can't join group due no vacancy");
        }
    }

}
