package attacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) damage);
        if(Math.random() <= 0.2){
            Effect.flinch(p);
        }
    }
}
