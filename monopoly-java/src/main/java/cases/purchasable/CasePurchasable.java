package cases.purchasable;

import cases.Case;
import game.Players;
import java.awt.Color;

public abstract class CasePurchasable extends Case {
    
  
    public CasePurchasable(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    public abstract  boolean VerifMonopol( Players players);
    public abstract void CaseEffect(Players players);
    public abstract boolean VerifEcart(Players players);
    
   
}

