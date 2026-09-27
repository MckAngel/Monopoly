package cards;
import game.* ;

public class ClosestService extends Cards{

    public ClosestService(String desc) {
        super(desc);
    }

    @Override
    public void applyRule(Players p, BoardInit b,Banque ban) {
        int pos = p.getPosition();
        if (pos < 12)       p.setPosition(12);
        else if (pos < 28)  p.setPosition(28);
        else                p.setPosition(12);  // dépassé 28 → on fait le tour jusqu'à 12
    }
    
    
}