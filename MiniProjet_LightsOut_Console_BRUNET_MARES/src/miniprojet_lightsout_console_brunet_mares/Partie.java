/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;
import java.util.Random;// nombre aléatoire
import java.util.Scanner ;


/**
 *
 * @author egnma
 */
public class Partie {
    GrilleLightsOut grilleJeu ;
    
    public void initialiserPartie(){
        //Création de la grille
        grilleJeu = new GrilleLightsOut();
        for(int i=0; i<5 ; i++){
            for(int j=0; j<5 ; j++){
                grilleJeu.grilleJeu[i][j]= "N"; //On initialise toutes les cases en noir
            }
        }
        //Placement aléatoire des cases allumées (entre 10 et 15 cases)
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int nbCasesClaires = r.nextInt(15 - 10 + 1) + 10; // NB aléatoire entre 1 et 0 !
        System.out.println(nbCasesClaires);
        int x = 0 ; 
        Random ligne = new Random();
        Random colonne = new Random();
        int LIGNE ;
        int COLONNE ;
        while (x <= nbCasesClaires){
            LIGNE = ligne.nextInt(5);
            COLONNE = colonne.nextInt(5);
            if (grilleJeu.grilleJeu[LIGNE][COLONNE]=="N"){
                grilleJeu.grilleJeu[LIGNE][COLONNE] = "B"; //Blanc = clair
                x += 1;
            }
        }
        grilleJeu.afficherGrilleSurConsole();
            
        
    
        
    }
        public void debuterPartie(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir colonne");
            
        }
}
