package cases.witheffect;

import game.Players;
import java.awt.Color;

public class CaseLuck extends CaseWithEffect {
    
    public CaseLuck(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    @Override
    public void CaseEffect(Players player){ // ajoute de l appel de la fonction tirer carte luck ici
        System.out.println("Pichez une carte chance");
        return ;
    }
}
