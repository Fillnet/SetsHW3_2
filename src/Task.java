import java.util.Objects;

public class Task {
    private final int a;
    private final int b;

    public Task(int a, int b) {


        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (a == task.a && b == task.b)||(a ==task.b && b ==task.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a * b, a + b);
    }

    @Override
    public String toString() {
        return String.format("\n%s * %s = ?", this.a, this.b);
    }
}
