package records;

import enums.Sizes;

public record Soil(String texture, String color) {
    @Override
    public String toString() {
        return texture + " " + color + " soil";
    }
}
