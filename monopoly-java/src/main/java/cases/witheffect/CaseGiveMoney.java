package cases.witheffect;

import game.Players;
import java.awt.Color;

public class CaseGiveMoney extends CaseWithEffect {

    public CaseGiveMoney(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }
    
    @Override
    public void CaseEffect(Players player){
        System.out.println("Vous recevez 200");
        player.modifyCredits(200);
    }
}
