import java.util.Objects;

public class Rock implements Sign {
    private final String name;

    public Rock() {
        this.name = "Rock";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rock rock = (Rock) o;
        return Objects.equals(name, rock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String
    toString() {
        return name;
    }
}
