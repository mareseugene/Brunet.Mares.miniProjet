/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;

import java.util.Random; // Importation de random
import java.util.Scanner; // Importation du scanner

/**
 *
 * @author Utilisateur
 */


public class Partie {
    
    Grille grilleJeu = new Grille(); // On crée l'objet grilleJeu
    Joueur joueurCourant; // On définie un joueur courant qui reste tout le temp le même
    Random rand = new Random(); // On crée un objet rand qui servira à créer un nombre aléatoire
    
    
    public Partie(Joueur joueur1){ // Constucteur de partie, on récupère le nom du joueur
        
        joueurCourant = joueur1; // On le stocke dans la variable joueurCouant
        
    }
    
    
    public void initialiserPartie(){ // Initialisation de la partie
        
        for (int i = 0 ; i < 25 ; i++){
            
            Light lumiere = new Light(); // On crée 25 objets de type Light
            
        }
    
        
        for (int i = 0 ; i < 5 ; i++){ // Ici on choisit combien de coup aléatoire on fait pour initialiser la partie.
            
            int ligneStart = rand.nextInt(5); // Nombre aléatoire pour la ligne
            int colonneStart = rand.nextInt(5); // Nombre aléatoire pour la colone
            
            grilleJeu.switchOnOff(ligneStart,colonneStart); // On change l'état de la cellule choisit aléatoirement
            
        }
    
    }
    
    
    
    public void debuterPartie(){ // On débuter la partie
        
        Scanner sc = new Scanner(System.in); // On définie le scanner
        
        int ligne; // On définie la variable pour la ligne
        int colonne; // On définie la variable pour la colonne.
        
        
        grilleJeu.afficherGrilleSurConsole(); // On affiche la grille en début de partie avec les coups générés aléatoirement.
        
        while (grilleJeu.etreGagnant() != true){ // Tant que la partie n'est pas gagné, on fait les instructions si dessous
            
            System.out.println("Saisissez la ligne puis la colonne de la case : "); // On demande au joueur de saisir les coordonnées de la case qu'il veut changer avec celles autour
            
            ligne = sc.nextInt()-1; // On lit la ligne qu'il rentre et on fait -1 pour avoir directement les coordonnées en java
            colonne = sc.nextInt()-1; // On lit la colonne qu'il rentre et on fait -1 pour avoir directement les coordonnées en java
            
            while (ligne < 0 || ligne > 4 || colonne < 0 || colonne > 4){ // Tant que le joueur rentre des coordonnées invalide (qui sont en dehors de la taille de grille) , on lui demande de reretrer des coordonnées

                    System.out.println("Erreur : veillez saissir des coordonnées valident"); // Affichage du message d'erreur
                    ligne = sc.nextInt()-1; // On lit la nouvelle ligne
                    colonne = sc.nextInt()-1; // On lit la nouvelle colonne
                    
            }
            
            grilleJeu.switchOnOff(ligne,colonne); // Une fois que les coordonnées sont valident, on appelle la fonction qui va changer les états de la cellule voulu et de celles autour
            
            grilleJeu.afficherGrilleSurConsole(); // On affiche la nouvelle grille
            
            joueurCourant.nbCoup ++; // On ajoute +1 au nombre de coup du joueur
            
            
        }
        
        System.out.println("Bravo "+joueurCourant.Nom+" ! Vous avez gagné en "+joueurCourant.nbCoup+" coups !"); 
        
        // Quand la boucle tant que se termine, cela veut dire que le joueur a gagné la partie. On affiche alors un message avec le nombre de
        // coup qu'il a effectué pour gagner.
        
        
    
    }
    
}
