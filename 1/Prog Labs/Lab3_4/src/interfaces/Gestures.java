package interfaces;
import abstract_classes.Person;
import arraylists.Pot;
import enums.Locations;
import records.Flower;
import records.Stone;

public interface Gestures {
    void thrust(Stone what, Person toWho);
    boolean took(Stone what, Person fromWho);
    boolean uproot(Flower what, Pot pot);
    boolean putInPot(Object what, Pot pot);
    void threw(Object what, Locations where);
}
