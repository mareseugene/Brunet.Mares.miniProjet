/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;

/**
 *
 * @author Utilisateur
 */

public class Light {
    
    boolean Etat; // On définie l'état de la cellule, elle est vrai si elle est allumé, faux si elle est éteinte
    
    
    public Light(){ // Constructeur de Light
        
        Etat = false; 
        // Par défaut, la cellule est éteinte au moment de la création du tableau de jeu, 
        // on en allumera par la suite quelques une pour créer quelques coups aléatoire en début de partie
    }
    
    
    public boolean lireEtat(){ // Permet de retourner l'état de la cellule
        
        return Etat;
    }
    
    
    
        
}
