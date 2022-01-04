/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_graphique_brunet_mares;

/**
 *
 * @author egnma
 */
public class CelluleLumineuse {
    
    Light lightCourante;
    //boolean Etat;
    
    
    public CelluleLumineuse(){
        
        lightCourante = new Light();
        
    }
    
    
    public boolean lireEtat(){
    
        return lightCourante.Etat;

    }
    
    
    public boolean allumer(){
        
        if (lightCourante.Etat == false){
            
            lightCourante.Etat = true;
            return true;
            
        }
        
        return false;
        
    }
    
    
    public boolean eteindre(){
        
        if (lightCourante.Etat == true){
            
            lightCourante.Etat = false;
            return true;
            
        }
        
        return false;
        
    }
    
    
    public void switchEtat(){
        
        if(lightCourante.lireEtat() == true){
            
            eteindre();
            
        }else{
            
            allumer();
            
        }
    }
}
