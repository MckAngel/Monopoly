package game ;
import cards.*;

import java.util.Scanner;

public class GameContext {
        public static void main(String[] args) {
            BoardInit board = new BoardInit();
            Deck deckChance = new Deck();
            Deck deckCommune = new Deck();
            boolean jouer = true;
            System.out.println("Combien de joueurs vont jouer ? ");
            Scanner scan = new Scanner(System.in);
            int nbJ = scan.nextInt();
            scan.nextLine();
            for(int i=0 ;i<nbJ ; i++){
                System.out.println("Player n°"+(i+1)+" donne ton nom :)");
                String name = scan.nextLine();
                board.listOfPlayers.add(new Players(name));
            }
            System.out.println("Initialisation des joueurs a été fait mtn le jeu va commencer. ");

            while( jouer == true ){
                for(int i=0 ;i<nbJ ; i++){
                    System.out.println(board.listOfPlayers.get(i).getName()+" Vous lancer les dées !! ");
                    int val = (int)(Math.random() * 6) + 1;
                    board.listOfPlayers.get(i).addToPosition(val);
                    int pos = board.listOfPlayers.get(i).getPosition() % 40;
                    System.out.println(board.listOfPlayers.get(i).getName()+" Vous lancer les dées !! et Vous avez obtenu "+val);
                    System.out.println("Vous arrive donc sur la case "+board.Map.get(pos).Get_NameOfcase());
                    board.Map.get(pos).CaseEffect(board.listOfPlayers.get(i));
                }







                
            }
        }
    

    


}