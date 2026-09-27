package cases.witheffect;

import game.Players;
import java.awt.Color;

public class CaseTaxes extends CaseWithEffect {
    
    public CaseTaxes(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    @Override
    public void CaseEffect(Players players){
        System.out.println("Vous devez payer des taxes");
        if( this.Get_IdCase() == 38){
            players.modifyCredits(-200);
            System.out.println("Vous Payez donc 200 euro");
        }else{
            players.modifyCredits(-100);
            System.out.println("Vous Payez donc 100 euro");
        }
        return ;
    }
}
