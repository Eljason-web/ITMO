package pokemon;

import ru.ifmo.se.pokemon.Type;
import attacks.*;
public class Vileplume extends Gloom{
    public Vileplume(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.GRASS, Type.POISON);
        setStats(75, 80, 85, 110, 90, 50);
        addMove(new StunSpore());
    }
}
