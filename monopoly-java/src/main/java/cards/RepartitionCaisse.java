package cards;

import game.*;



public class RepartitionCaisse extends Cards {

    public RepartitionCaisse(String desc) {
        super(desc);
    }
    @Override 
    public void applyRule(Players p , BoardInit b ,Banque ban){
        Buildings bui;
        int topay=0;
        for(int i =0 ;i < p.getLenghtB() ; i++){
            bui = p.getBuilding(i);
            if (bui.getType() == "h"){
                topay += 50 ;
            }
            else topay+=125;
        }
        p.modifyCredits(-topay);
        ban.addSold(topay);
        
    }
}