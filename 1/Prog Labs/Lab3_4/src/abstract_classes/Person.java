package abstract_classes;

import enums.Moods;

public abstract class Person {
    private final String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void introduce();
}
