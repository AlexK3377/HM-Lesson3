public class StudentRecord {

    public final String lastName;
    public final String recordBookId;

    public StudentRecord(String lastName, String recordBookId) {
        this.lastName = lastName;
        this.recordBookId = recordBookId;
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "lastName='" + lastName + '\'' +
                ", recordBookId='" + recordBookId + '\'' +
                '}';
    }
}
