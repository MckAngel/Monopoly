package cards;

import game.*;

public class GoToPrison extends Cards{

    public GoToPrison(String desc) {
        super(desc);
    }

    @Override
    public void applyRule(Players p , BoardInit b,Banque ban){
        p.setPosition(10);
        p.setState(state.emprisoned);
    }
}