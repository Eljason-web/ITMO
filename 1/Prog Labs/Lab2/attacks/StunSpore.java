package attacks;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore(){
        super(Type.GRASS, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
        Status condition = p.getCondition();
        if(condition.equals(Status.PARALYZE) && Math.random()<= 0.25){
            p.setMod(Stat.ATTACK, -6);
            p.setMod(Stat.SPEED, (int) p.getStat(Stat.SPEED)/2);
        }
    }
}
