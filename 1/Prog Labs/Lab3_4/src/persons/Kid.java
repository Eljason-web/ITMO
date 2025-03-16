package persons;

import abstract_classes.Person;
import enums.Locations;
import enums.Moods;
import interfaces.MoodActions;
import reporter.ReportManager;

public class Kid
        extends Person
        implements MoodActions
{
    private Locations location;
    private Moods mood;

    public Kid(String name, Locations location, Moods mood) {
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
    public void cluck(Moods mood) {
    }

    @Override
    public void changeMood(Moods mood) {
        if(this.mood == mood) {
            ReportManager.report(this.getName() + " got even more " + mood);
            return;
        }
        setMood(mood);
        ReportManager.report(this.getName() + " got " + this.mood);
    }
}
