/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_brunet_mares;

/**
 *
 * @author egnma
 */
public class Pion {
    //Attributs
    String COULEUR ; //Couleur du jeton (Rouge ou Bleu)
    String TYPE ;
    
    //Méthodes :
    public Pion(String couleur, String type) { //constructeur
        COULEUR = couleur;
        TYPE = type ;
    }
    public String lireType(){
        return TYPE ;
    }
    public String lireCouleur(){ //Initialisation de la couleur du jeton aléatoirement
        return COULEUR;
    }
    
}
