package cases.effectless;

import cases.Case;
import game.Players;
import java.awt.Color;

public class CaseEffectLess extends Case {
    
    public CaseEffectLess(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }
    
    public void CaseEffect ( Players players){
        System.out.println( players.getName()+" Vous venez d'arrivre sur la case "+this.Get_NameOfcase()+" Qui est une case sans effet ");
        return;
    }
}
