package pokemon;

import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Vulpix extends Pokemon {
    public Vulpix(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.FIRE);
        setStats(38, 41, 40, 50, 65, 65);
        setMove(new FireBlast(), new DarkPulse(), new Overheat());
    }
}
