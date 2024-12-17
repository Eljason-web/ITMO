package pokemon;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Dialga extends Pokemon {
    public Dialga(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.STEEL, Type.DRAGON);
        setStats(100, 120, 120, 150, 100, 90);
        setMove(new Facade(), new Confide(), new AuraSphere(), new EarthPower());

    }
}
