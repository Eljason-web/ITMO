package attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class NastyPlot extends StatusMove {
    public NastyPlot(){
        super(Type.FIRE, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Random rand = new Random();
        p.setMod(Stat.SPECIAL_ATTACK, 2);
    }
}
