/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;
import java.util.Scanner;
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
        
        System.out.println("Rentrez votre pseudo : ");
        Joueur joueur = new Joueur(sc.nextLine());
        
        
        Partie partie1 = new Partie(joueur);
        
        // On lance toute la partie
        
        partie1.initialiserPartie();
        
        partie1.debuterPartie();
    }
    
}
