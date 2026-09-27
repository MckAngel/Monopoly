package cards;

import game.*;


public abstract class Cards { 
    private String description ;

    
    public Cards(String des){
        this.description = des;
    }
    
    public String getDescription(){
        return this.description;
    }

    public void applyRule(Players p ,BoardInit b,Banque ban) {
        //noop
    }
}
