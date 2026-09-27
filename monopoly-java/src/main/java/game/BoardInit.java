package game;

import cases.Case;
import cases.effectless.CaseEffectLess;
import cases.purchasable.CaseField;
import cases.purchasable.CasePublicService;
import cases.purchasable.CaseStationPurch;
import cases.witheffect.CaseComunity;
import cases.witheffect.CaseGiveMoney;
import cases.witheffect.CaseLuck;
import cases.witheffect.CasePrison;
import cases.witheffect.CaseTaxes;
import java.awt.Color;
import java.util.ArrayList;

public class BoardInit {
    Color SPECIAL = Color.WHITE;
    Color GARE = Color.BLACK;        
    Color SERVICE = Color.LIGHT_GRAY;
    Color CHANCE = Color.ORANGE;
    Color CAISSE = Color.YELLOW;        
    Color TAXE = Color.GRAY;

    // Couleurs des groupes de terrains
    Color MARRON = new Color(149, 84, 54);
    Color BLEU_CLAIR = new Color(170, 224, 250);
    Color ROSE = new Color(217, 58, 150);
    Color ORANGE_GRP = new Color(247, 148, 29);
    Color ROUGE = new Color(237, 27, 36);
    Color JAUNE = new Color(254, 242, 0);
    Color VERT = new Color(31, 178, 90);
    Color BLEU_FONCE = new Color(0, 114, 187);

    public ArrayList <Players> listOfPlayers = new ArrayList<>();
    ArrayList <Case> Map = new ArrayList<>();

    

    
    public BoardInit(){
        Map.add(new CaseGiveMoney(0,  "Case Départ",              0,   SPECIAL,    "Recevez 200 en passant"));
        Map.add(new CaseComunity(2,  "Caisse de Communauté",     0,   CAISSE,     "Piochez une carte"));
        Map.add(new CaseField(3,  "Rue Lecourbe",             60,  MARRON,     "Terrain achetable"));
        Map.add(new CaseTaxes(4,  "Impôts sur le revenu",     0,   TAXE,       "Payez 200"));
        Map.add(new CaseField(5,  "Gare Montparnasse",        200, GARE,       "Gare achetable"));
        Map.add(new CaseField(6,  "Rue de Vaugirard",         100, BLEU_CLAIR, "Terrain achetable"));
        Map.add(new CaseLuck(7,  "Chance",                   0,   CHANCE,     "Piochez une carte"));
        Map.add(new CaseField(8,  "Rue de Courcelles",        100, BLEU_CLAIR, "Terrain achetable"));
        Map.add(new CaseField(9,  "Avenue de la République",  120, BLEU_CLAIR, "Terrain achetable"));

        // Côté 2
        Map.add(new CaseEffectLess(10, "Prison / Simple visite",   0,   SPECIAL,    "Vous êtes en simple visite"));
        Map.add(new CaseField(11, "Boulevard de la Villette", 140, ROSE,       "Terrain achetable"));
        Map.add(new CasePublicService(12, "Compagnie d'électricité",  150, SERVICE,    "Service public achetable"));
        Map.add(new CaseField(13, "Avenue de Neuilly",        140, ROSE,       "Terrain achetable"));
        Map.add(new CaseField(14, "Rue de Paradis",           160, ROSE,       "Terrain achetable"));
        Map.add(new CaseStationPurch(15, "Gare de Lyon",             200, GARE,       "Gare achetable"));
        Map.add(new CaseField(16, "Avenue Mozart",            180, ORANGE_GRP, "Terrain achetable"));
        Map.add(new CaseComunity(17, "Caisse de Communauté",     0,   CAISSE,     "Piochez une carte"));
        Map.add(new CaseField(18, "Boulevard Saint-Michel",   180, ORANGE_GRP, "Terrain achetable"));
        Map.add(new CaseField(19, "Place Pigalle",            200, ORANGE_GRP, "Terrain achetable"));

        // Côté 3
        Map.add(new CaseEffectLess(20, "Parc gratuit",             0,   SPECIAL,    "Aucun effet" ));
        Map.add(new CaseField(21, "Avenue Matignon",          220, ROUGE,      "Terrain achetable"));
        Map.add(new CaseLuck(22, "Chance",                   0,   CHANCE,     "Piochez une carte"));
        Map.add(new CaseField(23, "Boulevard Malesherbes",    220, ROUGE,      "Terrain achetable"));
        Map.add(new CaseField(24, "Avenue Henri-Martin",      240, ROUGE,      "Terrain achetable"));
        Map.add(new CaseStationPurch(25, "Gare du Nord",             200, GARE,       "Gare achetable"));
        Map.add(new CaseField(26, "Faubourg Saint-Honoré",    260, JAUNE,      "Terrain achetable"));
        Map.add(new CaseField(27, "Place de la Bourse",       260, JAUNE,      "Terrain achetable"));
        Map.add(new CasePublicService(28, "Compagnie des eaux",       150, SERVICE,    "Service public achetable"));
        Map.add(new CaseField(29, "Rue La Fayette",           280, JAUNE,      "Terrain achetable"));

        // Côté 4
        Map.add(new CasePrison(30, "Allez en prison",          0,   SPECIAL,    "Allez directement en prison"));
        Map.add(new CaseField(31, "Avenue de Breteuil",       300, VERT,       "Terrain achetable"));
        Map.add(new CaseField(32, "Avenue Foch",              300, VERT,       "Terrain achetable"));
        Map.add(new CaseComunity(33, "Caisse de Communauté",     0,   CAISSE,     "Piochez une carte"));
        Map.add(new CaseField(34, "Boulevard des Capucines",  320, VERT,       "Terrain achetable"));
        Map.add(new CaseStationPurch(35, "Gare Saint-Lazare",        200, GARE,       "Gare achetable"));
        Map.add(new CaseLuck(36, "Chance",                   0,   CHANCE,     "Piochez une carte"));
        Map.add(new CaseField(37, "Avenue des Champs-Élysées", 350, BLEU_FONCE,"Terrain achetable"));
        Map.add(new CaseTaxes(38, "Taxe de luxe",             0,   TAXE,       "Payez 100"));
        Map.add(new CaseField(39, "Rue de la Paix",           400, BLEU_FONCE, "Terrain achetable"));

    }
    
}
