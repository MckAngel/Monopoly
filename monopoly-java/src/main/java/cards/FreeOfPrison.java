package cards;
import game.* ;
import java.util.LinkedList;

public class FreeOfPrison extends Cards {
   
    public FreeOfPrison(String desc , LinkedList <Cards>  origindeck ){
        super(desc);
    }
    @Override 
    public void applyRule(Players p , BoardInit b ,Banque ban){
        p.setState(state.free) ;
    }
    
}