/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;

/**
 *
 * @author Utilisateur
 */
public class CelluleLumineuse {
    
    Light lightCourante; // Définition de la variable qui permet de désigner le lumière courante
    
    
    
    public CelluleLumineuse(){ // Constructeur de celluleLumineuse
        
        lightCourante = new Light(); // On crée l'objet lightCourante de type Light
        
    }
    
    
    public boolean lireEtat(){
    
        return lightCourante.Etat; // Cette fonction permet de lire l'état de la cellule, elle renvoie vrai si elle est allumé ou faux sinon.

    }
    
    
    public boolean allumer(){ // Permet d'allumer la cellule, retourne vrai si tout s'est bien passé
        
        if (lightCourante.Etat == false){ // Si la cellule est éteinte
            
            lightCourante.Etat = true; // On passe son état à vrai (allumé)
            return true;
            
        }
        
        return false;
        
    }
    
    
    public boolean eteindre(){ // Permet d'éteindre la cellule, retourne vrai si tout s'est bien passé
        
        if (lightCourante.Etat == true){ // Si la cellule est allumé
            
            lightCourante.Etat = false; // On passe son état à faux (éteinte)
            return true;
            
        }
        
        return false;
        
    }
    
    
    public void switchEtat(){ // Permet de changer l'état de la cellule sur allumé ou éteinte.
        
        if(lightCourante.lireEtat() == true){ // Si la cellule est allumé, 
            
            eteindre(); // alors on l'éteint
            
        }else{
            
            allumer(); // sinon on l'allume
            
        }
    }
    
}
