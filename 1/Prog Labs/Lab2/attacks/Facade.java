package attacks;

import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        Status condition = p.getCondition();
        if(condition.equals(Status.BURN) || condition.equals(Status.POISON) || condition.equals(Status.PARALYZE)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
        } else {
            p.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
}
