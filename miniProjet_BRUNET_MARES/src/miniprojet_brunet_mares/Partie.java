/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_brunet_mares;

import java.util.Random;

/**
 *
 * @author egnma
 */
public class Partie {
    
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Plateau plateauJeu = new Plateau();
    Random rand = new Random();

    
    public Partie(Joueur Joueur1, Joueur Joueur2){
        
        ListeJoueurs[0] = Joueur1 ;
        ListeJoueurs[1] = Joueur2 ;
        
    }
    
    
    public void InitialiserPartie(){
        
        
        
    }
    
    
    public void debuterPartie(){
        
        
        
        
        
    }
    
    
    public void AttribuerCouleursAuxJoueurs(Joueur J1, Joueur J2) {
        
        // Permet un choix aléatoire des couleurs
        
        int couleurhazard = rand.nextInt(2); // NB aléatoire entre 0 et 1 !
        
        if (couleurhazard == 0) {
            
            J1.affecterCouleur("Rouge"); //choix arbitraire
            J2.affecterCouleur("Jaune");
            
        } else {
            
            J1.affecterCouleur("Jaune");
            J2.affecterCouleur("Rouge");

        }
    }
}
