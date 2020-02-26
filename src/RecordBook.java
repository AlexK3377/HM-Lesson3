import java.util.Objects;
import java.util.UUID;

public class RecordBook {

    private String number;

    public RecordBook(String number) {
        this.number = number;
    }

    public String number() {
        return number;
    }

    public RecordBook() {
        this(UUID.randomUUID().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordBook that = (RecordBook) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "RecordBook{" +
                "number='" + number + '\'' +
                '}';
    }
}
