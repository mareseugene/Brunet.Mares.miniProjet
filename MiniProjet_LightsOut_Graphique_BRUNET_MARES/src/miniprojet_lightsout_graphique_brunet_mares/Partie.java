/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_graphique_brunet_mares;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author egnma
 */
public class Partie {
    
    Grille grilleJeu = new Grille();
    Joueur joueurCourant;
    Random rand = new Random();
    
    
    public Partie(Joueur joueur1){
        
        joueurCourant = joueur1;
        
    }
    
    
    public void initialiserPartie(){
        
        for (int i = 0 ; i < 25 ; i++){
            
            Light lumiere = new Light();
            
        }
    
        
        for (int i = 0 ; i < 7 ; i++){
            
            int ligneStart = rand.nextInt(5);
            int colonneStart = rand.nextInt(5);
            
            grilleJeu.switchOnOff(ligneStart,colonneStart);
            
        }
    
    }
    
    
    
    public void debuterPartie(){
        
        Scanner sc = new Scanner(System.in);
        
        int ligne;
        int colonne;
        
        
        grilleJeu.afficherGrilleSurConsole();
        
        while (grilleJeu.etreGagnant() != true){
            
            System.out.println("Saisissez la ligne puis la colonne de la case : ");
            
            ligne = sc.nextInt()-1;
            colonne = sc.nextInt()-1;
            
            while (ligne < 0 || ligne > 4 || colonne < 0 || colonne > 4){

                    System.out.println("Erreur : veillez saissir des coordonnées valident");
                    ligne = sc.nextInt()-1;
                    colonne = sc.nextInt()-1;
                    
            }          
            grilleJeu.switchOnOff(ligne,colonne);
            
            grilleJeu.afficherGrilleSurConsole();
            
            joueurCourant.nbCoup ++;
            
            
        }
        
        System.out.println("Bravo ! Vous avez gagné en "+joueurCourant.nbCoup+" coups");
        
        
    
    }
}
