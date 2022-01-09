/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;

import java.util.Scanner; // Import du scanner

/**
 *
 * @author Utilisateur
 */
public class MiniProjet_LightsOut_Console_BRUNET_MARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Règles du jeu :\nVous avez devant vous une grille de jeu avec des cases allumées des cases éteintes.\n"
                + "En appuyant sur une case, vous pouvez l'allumer ou l'éteindre. \nCela va aussi avoir un impact sur les cases adjacentes en modifiant leurs états.\n"
                + "Le but du jeu est d'éteindre toutes les cases de la grille de jeu.\n"
                + "Bonne chance !\n");
        
        System.out.println("Rentrez votre pseudo : "); // On demande au joueur de rentrer son nom
        Joueur joueur = new Joueur(sc.nextLine()); // On crée un objet joueur et on lui envoie le nom du joueur
        
        Partie partie1 = new Partie(joueur); // On crée un objet partie1
        
        // On lance toute la partie
        
        partie1.initialiserPartie(); // On initialise la partie en créant les 25 lumières et en faisant quelques coups aléatoire
        
        partie1.debuterPartie(); // On débute la partie
        
    }
    
}
