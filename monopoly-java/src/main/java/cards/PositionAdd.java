package cards;

import game.*;


public class PositionAdd extends Cards{
    private final int add;

    public PositionAdd(String desc, int a) {
        super(desc);
        this.add = a;
    }

    @Override
    public void applyRule(Players p ,BoardInit b ,Banque ban){
        p.addToPosition(add);
    }
}
