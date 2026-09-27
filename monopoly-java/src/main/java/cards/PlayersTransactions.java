package cards ;

import game.* ;

public class PlayersTransactions extends Cards{
    private int amount ;
    public PlayersTransactions(String desc , int amount) {
        super(desc);
        amount = amount ;
    }
    
    @Override
    public void applyRule(Players p , BoardInit b , Banque ban){
        Players player;
        for( int i =0 ; i< b.listOfPlayers.size() ; i++){
            player = b.listOfPlayers.get(i) ;
            p.modifyCredits(amount);
            player.modifyCredits(-amount);

        }
    }
    
}