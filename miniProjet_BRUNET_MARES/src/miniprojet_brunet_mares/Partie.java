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
    //Attributs :
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Plateau plateauJeu = new Plateau();

    //Méthodes :
    public Partie(Joueur Joueur1, Joueur Joueur2){
        ListeJoueurs[0] = Joueur1 ;
        ListeJoueurs[1] = Joueur2 ;
    }
    
    public void InitialiserPartie(){
        
        
    }
    
    public void debuterPartie(){
        
    }
    
    public void AttribuerCouleursAuxJoueurs(Joueur J1, Joueur J2) {
        //String Couleur1 = "\u001B[33m" +"O"+"\u001B[0m"; // JAUNE
        String Couleur1 = "J"; // JAUNE
        //String Couleur2 = "\u001B[31m"+"O"+"\u001B[0m"; //ROUGE
        String Couleur2 = "R"; // JAUNE
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int couleurhazard = r.nextInt(2); // NB aléatoire entre 1 et 0 !
        if (couleurhazard == 0) {
            J1.affecterCouleur(Couleur1); //choix arbitraire
            J2.affecterCouleur(Couleur2);
        } else {
            J1.affecterCouleur(Couleur2);
            J2.affecterCouleur(Couleur1);

        }
    }
}
