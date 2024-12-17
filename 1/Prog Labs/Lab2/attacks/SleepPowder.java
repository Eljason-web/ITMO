package attacks;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    public SleepPowder(){
        super(Type.GRASS, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.sleep(p);
        //something to add?
    }
}
