# Monopoly en Java

Réimplémentation du jeu Monopoly en Java, développée en autonomie pour mettre en pratique la programmation orientée objet (héritage, polymorphisme, encapsulation). Elle fait suite à une première version très simple codée en L1.

> **État actuel :** version jouable **en console**. L'interface graphique JavaFX est prévue (dépendance déjà configurée dans le `pom.xml`), mais pas encore développée.

## Aperçu

Le projet modélise les mécaniques centrales du jeu :

- **Plateau et joueurs** : positions, déplacements, gestion de la banque.
- **Cases** organisées par comportement grâce à une hiérarchie de classes :
  - `CaseEffectLess` : cases sans effet ;
  - `CasePurchasable` (`CaseField`, `CaseStationPurch`, `CasePublicService`) : terrains, gares et services publics achetables ;
  - `CaseWithEffect` (`CaseLuck`, `CaseComunity`, `CaseTaxes`, `CasePrison`, `CaseGiveMoney`) : cases à effet (chance, communauté, taxes, prison…).
- **Cartes Chance / Communauté** (`Deck`, `Cards` et ses variantes) : déplacement, transactions entre joueurs, sortie de prison, modification d'argent…

Chaque case redéfinit sa propre méthode d'effet : la boucle de jeu appelle la même méthode sur n'importe quelle case, et c'est le polymorphisme qui déclenche le bon comportement.

## Technologies

- Java 17
- Maven

## Structure du projet

```
monopoly-java/
├── pom.xml
└── src/main/java/
    ├── game/   # Boucle de jeu (GameContext), plateau, joueurs, banque
    ├── cases/  # Hiérarchie des types de cases
    └── cards/  # Cartes Chance et Communauté
```

## Lancer le projet

```bash
cd monopoly-java
mvn compile
java -cp target/classes game.GameContext
```

## Prochaines étapes

- Lancer de deux dés et gestion des doubles.
- Fin de partie (faillite d'un joueur, condition de victoire).
- Interface graphique JavaFX.

## Ce que ce projet démontre

- Modélisation orientée objet d'un système à règles multiples (héritage et polymorphisme pour factoriser le comportement des cases et des cartes).
- Structuration d'un projet Java avec Maven.
- Passage d'un prototype en ligne de commande (L1) à une base de code réorganisée.

## Auteur

Michael Djeatsa Keleko — projet personnel, étudiant en L3 MIAGE Informatique.
