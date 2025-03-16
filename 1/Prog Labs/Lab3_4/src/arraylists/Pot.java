package arraylists;

import exceptions.InvalidObjectTypeException;
import exceptions.ObjectNotFoundException;
import records.Flower;
import records.Soil;
import records.Stone;
import reporter.ReportManager;

import java.util.ArrayList;

public class Pot {
    private final ArrayList<Object> pot = new ArrayList<>();

    public void addToPot(Object obj) throws InvalidObjectTypeException {
        try {
            if(!(obj instanceof Flower || obj instanceof Soil || obj instanceof Stone)){
                throw new InvalidObjectTypeException("EXCEPTION: Only Flowers, stones and soil can be added");
            }
            pot.add(obj);
            ReportManager.report(obj + " is now in the pot");
        } catch (InvalidObjectTypeException e) {
            ReportManager.report(e.getMessage());
        }
    }

    public void removeFromPot(Object obj) throws ObjectNotFoundException {
        try {
            if (!pot.contains(obj)) {
                throw new ObjectNotFoundException("EXCEPTION: The object is not found in the pot.");
            }
            pot.remove(obj);
            ReportManager.report(obj + " is now removed from the pot");
        } catch (ObjectNotFoundException e) {
            ReportManager.report(e.getMessage());
        }
    }
}
