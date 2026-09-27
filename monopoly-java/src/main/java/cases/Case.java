package cases;

import game.Players;
import java.awt.Color;

public abstract class Case {
 private int NbHouse;
 private int NbHotel;
 private String NameOfcase; 
 private Players Owner;
 private int Price;
 private int IdCase;
 private Color CaseColor;
 
    public Case(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect) {
        this.IdCase = idCase;
        this.NameOfcase = nameOfCase;
        this.Price = price;
        this.CaseColor = caseColor;
        this.NbHouse = 0;
        this.NbHotel = 0;
        this.Owner = null;
    }
    
    public Case (){}

    public void Set_NbHouse(){ // find a way to give back all houses to bank when Nbhouse = 5
        if ( this.NbHouse < 5){
            this.NbHouse +=1;
        } else {
            this.NbHotel = 1;
        }
    }
    
    public int get_NbHouse(){
        return this.NbHouse;
    }
    
    public int Get_NbHotel(){
        return this.NbHotel;
    }

    public String Get_NameOfcase(){
        return this.NameOfcase;
    }

    public Players Get_Owner(){
        return this.Owner;
    }
    
    public void Set_Owner(Players Owner){
        this.Owner = Owner;
    }

    public int Get_Price(){
        return this.Price;
    }

    public int Get_IdCase(){
        return this.IdCase;
    }

    public Color Get_CaseColor(){
        return this.CaseColor;
    }

    public Case get_Case(){
        return this;
    }
    public abstract void CaseEffect(Players player);

    
}
