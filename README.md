# E-certificates Application

## Description
Cette application Android présente un exercice qui permet à l'utilisateur de sélectionner des réponses à deux questions dans une interface simple. L'utilisateur peut choisir des réponses via des cases à cocher (CheckBox) et des boutons radio (RadioButton). Les réponses sélectionnées sont ensuite affichées dans une autre activité lorsque l'utilisateur clique sur le bouton **Suivant**, et l'application se ferme lorsque l'utilisateur clique sur le bouton **Quitter**.

## Objectifs de l'exercice :
1. Créer l'interface graphique représentée sur l'image ci-dessous en XML.
2. Afficher les réponses sélectionnées dans une autre activité lorsqu'on appuie sur le bouton **Suivant**.
3. Permettre à l'utilisateur de quitter l'activité actuelle en appuyant sur le bouton **Quitter**.

## Fonctionnalités
- Une **question à choix multiples** sur la signification du pattern MVC avec plusieurs options de réponses (CheckBox).
- Une **question à réponse unique** sur la syntaxe JSP, avec des boutons radio (RadioButton) pour les réponses.
- Deux boutons :
  - **Suivant** pour naviguer vers une nouvelle activité qui affiche les réponses sélectionnées.
  - **Quitter** pour fermer l'application.

## XML pour l'interface graphique

L'interface utilisateur est définie dans un fichier XML, qui comprend :
- Un **TextView** pour chaque question.
- Plusieurs **CheckBox** pour les réponses à la première question.
- Des **RadioButton** pour les réponses à la deuxième question.
- Un **Button** pour quitter l'application.
- Un **Button** pour passer à l'activité suivante.

## Java pour la logique

1. **Affichage des réponses sélectionnées :**
   - Lorsque l'utilisateur clique sur le bouton **Suivant**, une **nouvelle activité** est lancée qui récupère les réponses sélectionnées dans la première activité.
  
2. **Quitter l'application :**
   - Lorsque l'utilisateur clique sur le bouton **Quitter**, l'activité actuelle est fermée avec la méthode `finish()`.


## Technologies utilisées
- **Langage** : Java (Android SDK)
- **Interface utilisateur** : XML (pour la mise en page Android)
- **Plateforme** : Android

## Instructions d'installation
1. Clonez ce dépôt GitHub.
2. Ouvrez le projet dans Android Studio.
3. Exécutez l'application sur un émulateur Android ou un appareil physique.

## Utilisation
1. Sélectionnez les réponses aux questions via les cases à cocher et les boutons radio.
2. Cliquez sur **Suivant** pour voir les réponses sélectionnées dans une nouvelle activité.
3. Cliquez sur **Quitter** pour fermer l'application.
