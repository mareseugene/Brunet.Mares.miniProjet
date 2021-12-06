/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_brunet_mares;

/**
 *
 * @author egnma
 */

public class Plateau {
    //Attributs : 
    
    Plateau [][] PlateauJeu = new Plateau[5][5];
    
    public Plateau(){
        
    }
    
    public void initialiserPiece(){
        // Creation de tous les pions
        Piece Pion1J1 = new Piece("Rouge", "Pion") ;
        Piece Pion2J1 = new Piece("Rouge", "Pion") ;
        Piece Pion3J1 = new Piece("Rouge", "Pion") ;
        Piece Pion4J1 = new Piece("Rouge", "Pion") ;
        Piece Pion1J2 = new Piece("Bleu", "Pion") ;
        Piece Pion2J2 = new Piece("Bleu", "Pion") ;
        Piece Pion3J2 = new Piece("Bleu", "Pion") ;
        Piece Pion4J2 = new Piece("Bleu", "Pion") ;
        
       // Creation des Rois :
       Piece RoiJ1 = new Piece ("Rouge","Roi");
       Piece RoiJ2 = new Piece ("Bleu","Roi");
    }
    
        
        
    
    public void piocherCarte(){ // Prendre la carte du deck pour la mettre devant le joueur
        
    }
    
    
    
}
