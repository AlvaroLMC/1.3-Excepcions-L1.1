package months;

public class Month {
    private final String name;

    public Month(String name) {
        this.name = name;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month month)) return false;
        return name.equalsIgnoreCase(month.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
