# Monopoly en Java

Réimplémentation du jeu Monopoly en Java, développée en autonomie pour mettre en pratique les principes de la programmation orientée objet (héritage, polymorphisme, encapsulation) après une première version très simple codée en L1 en ligne de commande.

## Aperçu

Le projet modélise les mécaniques centrales du jeu :

- **Plateau et joueurs** : positions, déplacements, gestion de la banque.
- **Cases** organisées par comportement grâce à une hiérarchie de classes :
  - `CaseEffectLess` — cases sans effet.
  - `CasePurchasable` (`CaseField`, `CaseStationPurch`, `CasePublicService`) — terrains, gares et services publics achetables.
  - `CaseWithEffect` (`CaseLuck`, `CaseComunity`, `CaseTaxes`, `CasePrison`, `CaseGiveMoney`) — cases à effet (chance, communauté, taxes, prison…).
- **Cartes Chance / Communauté** (`Deck`, `Cards` et ses variantes) : déplacement, transactions entre joueurs, sortie de prison, modification d'argent…

## Technologies

- Java 17
- Maven (build et gestion des dépendances)
- JavaFX (dépendance configurée dans le projet pour une interface graphique)

## Structure du projet

```
src/main/java/
├── game/     # Boucle de jeu, plateau, joueurs, banque
├── cases/    # Hiérarchie des types de cases
└── cards/    # Cartes Chance et Communauté
```

## Lancer le projet

```bash
mvn compile
mvn exec:java -Dexec.mainClass="game.GameContext"
```

## Ce que ce projet démontre

- Modélisation orientée objet d'un système à règles multiples (héritage et interfaces pour factoriser le comportement des cases et des cartes).
- Structuration d'un projet Java avec Maven.
- Passage d'un prototype en ligne de commande (L1) à une base de code réorganisée et plus propre.

## Auteur

Michael Djeatsa Keleko — projet personnel, étudiant en L3 MIAGE Informatique.
