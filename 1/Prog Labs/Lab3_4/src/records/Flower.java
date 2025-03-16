package records;

public record Flower(String name) {
    @Override
    public String toString() {
        return name;
    }
}
