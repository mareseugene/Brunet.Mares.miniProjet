/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_brunet_mares;

/**
 *
 * @author egnma
 */
public class Piece {
    
    String Couleur ;
    String Type ;
    
    
    public Piece(String couleur, String type) { 
        
        Couleur = couleur;
        Type = type ;
        
    }
    
    public String lireCouleur(){ 
        
        return Couleur;
        
    }
    
    
    public String lireType(){
        
        return Type ;
        
    }
    
    
    
    
}
