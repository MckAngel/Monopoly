package cases.witheffect;

import game.Players;
import java.awt.Color;

public class CaseComunity extends CaseWithEffect {

    public CaseComunity(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect){
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    @Override
    public void CaseEffect(Players player){ // ajoute appel tirage carte ici aussi
        System.out.println("Pichez une carte caisse de communauté");
        return ;
    }
}
