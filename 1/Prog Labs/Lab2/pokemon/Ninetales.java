package pokemon;

import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Ninetales extends Vulpix{
    public Ninetales(String pokemonName, int startLevel) {
        super(pokemonName, startLevel);
        setType(Type.FIRE);
        setStats(73, 76, 75, 81, 100, 100);
        addMove(new NastyPlot());
    }
}
