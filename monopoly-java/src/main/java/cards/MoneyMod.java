package cards;
import game.* ;


public class MoneyMod extends Cards {
    private int amount;

    public MoneyMod(String desc, int amount){
        super(desc);
        this.amount = amount;
    }
    
    @Override
    public void applyRule(Players p, BoardInit b,Banque ban){
        p.modifyCredits(amount);
        ban.addSold(-amount);
    }
}
