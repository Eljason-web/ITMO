import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Dialga dialga = new Dialga("Danzo", 1);
        Vulpix vulpix = new Vulpix("Vodemon", 1);
        Ninetales ninetales = new Ninetales("Kurama", 1);
        Oddish oddish = new Oddish("Odon", 1);
        Gloom gloom = new Gloom("Glomero", 1);
        Vileplume vileplume = new Vileplume("villy", 1);

        battle.addAlly(dialga);
        battle.addAlly(vulpix);
        battle.addAlly(ninetales);
        battle.addFoe(oddish);
        battle.addFoe(gloom);
        battle.addFoe(vileplume);

        battle.go();


    }
}