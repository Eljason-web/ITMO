package pokemon;

import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Gloom extends Oddish{
    public Gloom(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.GRASS, Type.POISON);
        setStats(60, 65, 70, 85, 75, 40);
        addMove(new SleepPowder());
    }
}
