package cards;
import game.* ;

class ClosestGare extends Cards {
    public ClosestGare(String desc) {
        super(desc);
    }
    @Override 
    public void applyRule(Players p , BoardInit b,Banque ban){
        int pos = p.getPosition() ;
        if(pos <5 ) p.setPosition(5);
        else if(pos <15) p.setPosition(15);
        else if(pos <25) p.setPosition(25);
        else if (pos < 35) p.setPosition(35);
        else p.setPosition(5);
    }
}