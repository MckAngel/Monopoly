package cards;

import game.*;


public class PositionMod extends Cards {
    private final int posMove;

    public PositionMod(String desc, int m) {
        super(desc);
        this.posMove = m;
    }

    @Override 
    public void applyRule(Players p , BoardInit b,Banque ban){
        int pos = p.getPosition() ;
        if(pos > posMove) p.modifyCredits(200);
        ban.addSold(-200);
        p.setPosition(posMove);
    }
}
