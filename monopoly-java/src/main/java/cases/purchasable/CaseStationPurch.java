package cases.purchasable;

import game.Players;
import java.awt.Color;
import java.util.Scanner;

public class CaseStationPurch extends CasePurchasable {

    private final int[] loyer = {10, 30, 90, 270, 400}; // to update !!

    public CaseStationPurch(int idCase, String nameOfCase, int price, Color caseColor, String caseEffect){
        super(idCase, nameOfCase, price, caseColor, caseEffect);
    }

    @Override
    public boolean VerifMonopol( Players players ){
        int cnt = 0;
       while ( players.getGare(cnt) != null ){
            cnt++;
       }
        if ( cnt == 3 ) {
            return true;
        }
        return false;
    }
    @Override
    public boolean VerifEcart(Players players){
        int delta, i = 0, j= 0;
        while( players.getField(i) != null){
            while( players.getField(j) != null){
                if ( players.getGare(i).get_NbHouse() - players.getGare(j).get_NbHouse() > 1 )
                    return false;
            }
        }
        return true;
    }

    public void BuildHouse(Players players){
        System.out.println("Nice! Vous arrivez chez vous!"); 
        if ( this.VerifMonopol(players) == true ){
            if ( VerifEcart(players) == true ){
                System.out.println("Voulez-vous y construire une nouvelle maison ?");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                if ( str.equals("oui")){
                    if( this.get_NbHouse() == 5){
                        System.err.println("Ce n'est pas possible! Vous avez deja 1 hotel ici");
                    } else {
                        this.Set_NbHouse();
                        if ( this.get_NbHouse() < 5 ){
                            System.out.println("Felicitation! Vous avez achetez une nouvelle maison. NbMaison : "+ this.get_NbHouse());
                        } else {
                            System.out.print("Felicitation!! cette case possede a present un hotel");
                        }
                    }
                } else {
                    System.out.println("Ok !!!");
                }
            } else {
                System.err.println("Erf! vous ne repectez pas la regle des ecarts");
            }
        } else {
            System.out.println("Malheuresement vous n'avez le monopole sur une aucune couleur ");
        }
    }


    @Override
    public void CaseEffect(Players players){
        if( this.Get_Owner() == null ){ // first owner
            System.out.println("Voulez-vous Acheter cette case (oui) ou la mettre en enchère (non) ? oui ou non");
            Scanner sc = new Scanner( System.in);
            String str = sc.nextLine();
            if( str.equals("non")){
                // Logic de mise en enchere 
            } else {
                players.modifyCredits(-this.Get_Price());
                System.out.println("Felicitation vous êtes le premier a acheté cette case");
                this.Set_Owner(players);
                this.Set_NbHouse();
                players.setField(this);
            }
        } else {
            if( !this.Get_Owner().getName().equals(players.getName())){ // not the owner
                System.out.println("Oups!! Vous êtes arrivé sur une case qui ne vous appartient pas");
                if ( this.Get_NbHotel() == 1 ){
                    players.modifyCredits(-loyer[4] );
                } else {                
                    players.modifyCredits(-loyer[this.get_NbHouse()-1]);
                }
            } else {
                BuildHouse(players);
            }
        }
        return ;
    }
}
