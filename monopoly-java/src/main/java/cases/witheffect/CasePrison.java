package cases.witheffect;

import game.Players;
import java.awt.Color;

public class CasePrison extends CaseWithEffect{
    
    public CasePrison(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    @Override
    public void CaseEffect(Players players){
        System.out.println("Vous êtes allé en prison");
        players.setPosition(this.Get_IdCase());
        return;
    }
}
