/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_brunet_mares;
import java.util.ArrayList;
/**
 *
 * @author egnma
 */
public class Joueur {
    
    //Attributs
    String Nom ;
    String Couleur;
    ArrayList<Piece> ListePieces = new ArrayList<Piece>() ;
    
    // Méthodes
    public Joueur(String nom, String couleur){
        Nom = nom;
        Couleur = couleur;
    }
    
    public void affecterCouleur(String Couleur){
        this.Couleur = Couleur;
        //On utilise this car le nom de la variable globale (Couleur)
        // est le même que celui de la variable en argument de la méthode
    }
    
    
}
