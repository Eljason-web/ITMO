package attacks;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        //maybe something to add
        p.setMod(Stat.HP, (int) damage);
    }
}
