import java.util.Objects;

public class Scissors implements Sign {

    private final String name;

    public Scissors() {
        this.name = "Scissors";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scissors scissors = (Scissors) o;
        return Objects.equals(name, scissors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;

    }
}
