package cases.witheffect;

import cases.Case;
import game.Players;
import java.awt.Color;

public abstract class CaseWithEffect extends Case {
    private String effect;

    public CaseWithEffect(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        super(idCase, nameOfCase, price, caseColor, caseEffect);
        this.effect = caseEffect;
    }

    public abstract void CaseEffect(Players player);
}
