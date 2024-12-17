package attacks;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    public EarthPower(){
        super(Type.GROUND, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) damage);
        if(Math.random() <= 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE, (int) damage);
        }
    }
}
