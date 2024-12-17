package attacks;

import ru.ifmo.se.pokemon.*;

public class AuraSphere extends SpecialMove {
    public AuraSphere(){
        super(Type.FIGHTING, 80, Double.POSITIVE_INFINITY);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        //something to add maybe
        p.setMod(Stat.HP, (int) damage);
    }
}
