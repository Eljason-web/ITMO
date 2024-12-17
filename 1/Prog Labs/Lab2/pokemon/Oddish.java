package pokemon;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.GRASS, Type.POISON);
        setStats(45, 50, 55, 75, 65, 30);
        setMove(new DoubleTeam(), new DazzlingGleam());

    }
}
