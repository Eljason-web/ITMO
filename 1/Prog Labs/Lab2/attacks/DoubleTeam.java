package attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Random rand = new Random();
        p.setMod(Stat.EVASION, -1);
    }
}
