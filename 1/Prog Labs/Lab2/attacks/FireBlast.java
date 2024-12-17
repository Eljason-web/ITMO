package attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) damage);
        if(Math.random() <= 0.1){
            Effect.burn(p);
        }
    }
}
