package records;

import enums.Locations;
import enums.Sizes;

public record Stone(Sizes size, String texture, String color){
    @Override
    public String toString() {
        return size + " " + texture + " " + color + " stone";
    }
}
