package cards;

import java.util.LinkedList;

public class Deck {
    private LinkedList<Cards> chance;
    private LinkedList<Cards> communityFund ;

    public Deck(){
        this.chance = new LinkedList<>();
        this.communityFund = new LinkedList<>();
    }

    public LinkedList initDeckComm(){
        communityFund.add(new MoneyMod("Erreur de la banque en votre faveur : recevez 200", 200));
        communityFund.add(new MoneyMod("Recevez votre intérêt sur l'emprunt à 7 % : 25", 25));
        communityFund.add(new MoneyMod("Recevez votre revenu annuel : 100", 100));
        communityFund.add(new MoneyMod("Vous héritez : 100", 100));
        communityFund.add(new MoneyMod("Second prix d'un concours de beauté : recevez 10", 10));
        communityFund.add(new MoneyMod("Les contributions vous remboursent : 20", 20));
        communityFund.add(new MoneyMod("Honoraires de consultation : recevez 25", 25));
        communityFund.add(new MoneyMod("Honoraires de médecin : payez 50", -50));
        communityFund.add(new MoneyMod("Police d'assurance : payez 50", -50));
        communityFund.add(new MoneyMod("Hôpital : payez 100", -100));
        communityFund.add(new MoneyMod("Note du collège : payez 50", -50));
        communityFund.add(new PositionMod("Avancez à la Case Départ", 0));
        communityFund.add(new GoToPrison("Allez en prison"));
        communityFund.add(new FreeOfPrison("Vous êtes libéré de prison", communityFund));
        communityFund.add(new RepartitionCaisse("Vous êtes imposé pour les réparations des rues : 40 par maison, 115 par hôtel"));
        communityFund.add(new PlayersTransactions("C'est votre anniversaire : recevez 10 de chaque joueur", 10));
        return communityFund ;
    }
    public LinkedList initDeckChance(){
        chance.add(new MoneyMod("La banque vous verse un dividende de 50", 50));
        chance.add(new MoneyMod("Votre immeuble et votre prêt rapportent 150", 150));
        chance.add(new MoneyMod("Amende pour excès de vitesse : payez 15", -15));
        chance.add(new PositionMod("Avancez à la Case Départ", 0));
        chance.add(new PositionMod("Avancez à la Rue de la Paix", 39));
        chance.add(new PositionMod("Avancez à l'Avenue Henri-Martin", 24));
        chance.add(new PositionMod("Avancez au Boulevard de la Villette", 11));
        chance.add(new PositionMod("Prenez le train pour la Gare de Lyon", 15));
        chance.add(new PositionAdd("Reculez de 3 cases", -3));
        chance.add(new ClosestGare("Avancez jusqu'à la gare la plus proche"));
        chance.add(new ClosestService("Avancez jusqu'à la compagnie d'eau ou d'électricité la plus proche"));
        chance.add(new GoToPrison("Allez en prison"));
        chance.add(new FreeOfPrison("Vous êtes libéré de prison", chance));
        chance.add(new RepartitionChance("Faites des réparations sur toutes vos propriétés : 25 par maison, 100 par hôtel"));
        chance.add(new PlayersTransactions("Vous êtes élu président du conseil : payez 50 à chaque joueur", -50));
        return chance ;
    }
    
}
