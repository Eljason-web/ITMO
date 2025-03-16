package persons;

import abstract_classes.Person;
import arraylists.Pot;
import enums.Locations;
import enums.Moods;
import exceptions.InvalidObjectTypeException;
import interfaces.Gestures;
import interfaces.MoodActions;
import interfaces.Motions;
import records.Flower;
import records.Stone;
import reporter.ReportManager;

public class Carlson extends Person
    implements Motions, Gestures, MoodActions {
    private Locations location;
    private Moods mood;

    public Carlson(String name, Locations location, Moods mood) {
        super(name);
        this.location = location;
        this.mood = mood;
        introduce();
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public Moods getMood() {
        return mood;
    }

    public void setMood(Moods mood) {
        this.mood = mood;
    }

    @Override
    public void introduce() {
        ReportManager.report(this.getName() + " has been introduced to the plot");
    }

    @Override
    public void crawl(Locations to) {
        Locations from = this.location;
        if(from == to){
            ReportManager.report(this.getName() + " is already at " + to);
            return;
        }

        setLocation(to);
        ReportManager.report(this.getName() + " crawled from " + from + " to " + to);
    }

    @Override
    public void walk(Locations to) {
        Locations from = this.location;
        if(from == to){
            ReportManager.report(this.getName() + " is already at " + to);
            return;
        }

        setLocation(to);
        ReportManager.report(this.getName() + " hurried from " + from + " to " + to);
    }

    @Override
    public void thrust(Stone stone, Person toWho) {
        if (this.getName().equals(toWho.getName())) {
            ReportManager.report(this.getName() + " can not give " + stone + " to himself");
            return;
        }
        ReportManager.report(this.getName() + " thrust the " + stone + " to " + toWho.getName());
    }

    @Override
    public boolean took(Stone what, Person fromWho) {
        ReportManager.report(this.getName() + " took the " + what + " from " + fromWho.getName());
        return false;
    }

    @Override
    public boolean uproot(Flower flower, Pot pot) {
        pot.removeFromPot(flower);
        ReportManager.report(this.getName() + " uprooted the " + flower + " from the pot");
        return true;
    }

    @Override
    public boolean putInPot(Object what, Pot pot) throws InvalidObjectTypeException {
        pot.addToPot(what);
        ReportManager.report(this.getName() + " put the " + what + " in the pot");
        return true;
    }

    @Override
    public void threw(Object what, Locations where) {
        ReportManager.report(this.getName() + " threw " + what + " " + where);
    }

    @Override
    public void cluck(Moods mood) {
        setMood(mood);
        ReportManager.report(this.getName() + " clucked");
    }

    @Override
    public void changeMood(Moods mood) {
    }
}
