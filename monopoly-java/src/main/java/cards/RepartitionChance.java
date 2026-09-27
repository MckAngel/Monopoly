package cards;

import game.*;



public class RepartitionChance extends Cards {

    public RepartitionChance(String desc) {
        super(desc);
    }
    @Override 
    public void applyRule(Players p , BoardInit b ,Banque ban){
        Buildings bui;
        int topay=0;
        for(int i =0 ;i < p.getLenghtB() ; i++){
            bui = p.getBuilding(i);
            if (bui.getType() == "h"){
                topay += 25 ;
            }
            else topay+=100;
        }
        p.modifyCredits(-topay);
        ban.addSold(topay);
        
    }
}