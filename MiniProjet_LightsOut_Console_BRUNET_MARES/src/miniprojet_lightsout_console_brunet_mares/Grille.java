/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_console_brunet_mares;

/**
 *
 * @author Utilisateur
 */
public class Grille {
    
    CelluleLumineuse [][] tableauDeJeu = new CelluleLumineuse[5][5]; // On crée le tableau de jeu de 5x5
    
    
    
    public Grille(){ // Constructeur de Grille
        
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                
                tableauDeJeu [i][j] = new CelluleLumineuse(); // On crée chaque cellule du tableau de jeu
                
            }
        }
        
    }
    
    
    public void afficherGrilleSurConsole(){
        
        for (int i = 4  ; i >= 0; i--){
            
            System.out.print("\033[30m");
            System.out.print(i+1+" "); // Affichage du numéro des lignes en noir
            
            for (int j = 0 ; j < 5 ; j++){
                
                if (tableauDeJeu[i][j].lireEtat() == true){// si la case est allumée
                        
                        System.out.print("\033[35m O "); // on affiche en violet
                        
                    }
                
                else{ //si la case est etteinte 
                        
                        System.out.print("\033[37m O "); // On affiche en gris
                        
                    }
                
            }
            
            System.out.println(""); // permet de retourner a la ligne, pour former une grille de jeu
        }
        
        System.out.println("   1  2  3  4  5\n"); // Affichage du numéro des colonnes
    
        
        
    }
    
    
    public boolean lireEtat(int numLigne,int numColonne){
        
        return tableauDeJeu[numLigne][numColonne].lightCourante.Etat; // Permet de retourner l'état de la cellule demandée, vrai ou faux
        
    }
    
    
    public boolean etreGagnant(){
        
        boolean toutEteint = true; // On part du principe que tout est éteint
        
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                
                // On regarde si la grille est gagnante en vérifiant que toutes les cellules sont éteintes. 
                //S'il y a juste une cellule d'allumée, alors on revoie directement faux
                
                if (tableauDeJeu[i][j].lireEtat() == true){
                
                    toutEteint = false;
                    return toutEteint;
                }
                
            }
        }
        return toutEteint; // Renvoie vrai ou faux
        
    }
    
    
    public boolean switchOnOff(int numLigne, int numColonne){
        
        // Cette fonction permet de changer l'état de la cellule sélectionné et de celles autour. Retourne vrai si tout s'est bien passé, faux sinon.
        
        // Pour le carré central, on change l'état de la cellule sélectionnée et des 4 cellules autour 
        
        if (0 < numLigne && numLigne < 4 && 0 < numColonne && numColonne < 4){
            
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
            
        // Pour le coin en bas à gauche, on change l'état de la cellule sélectionnée et des 2 cellules autour 
        }else if (numLigne == 0 && numColonne == 0){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        // Pour le coin en bas à droite, on change l'état de la cellule sélectionnée et des 2 cellules autour
        }else if (numLigne == 0 && numColonne == 4){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        // Pour le coin en haut à gauche, on change l'état de la cellule sélectionnée et des 2 cellules autour
        }else if (numLigne == 4 && numColonne == 0){
            
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        // Pour le coin en haut à droite, on change l'état de la cellule sélectionnée et des 2 cellules autour
        }else if (numLigne == 4 && numColonne == 4){
            
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
        
            
        // Pour la ligne du bas, on change l'état de la cellule sélectionnée et des 3 cellules autour
        }else if (numLigne == 0 && 0 < numColonne && numColonne < 5){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        // Pour la ligne du haut, on change l'état de la cellule sélectionnée et des 3 cellules autour
        }else if (numLigne == 4 && 0 < numColonne && numColonne < 5){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
        
        // Pour la colonne de gauche, on change l'état de la cellule sélectionnée et des 3 cellules autour
        }else if (0 < numLigne && numLigne < 5 && numColonne == 0){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        // Pour la colonne de droite, on change l'état de la cellule sélectionnée et des 3 cellules autour
        }else if (0 < numLigne && numLigne < 5 && numColonne == 4){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat(); // Milieu
            return true;
            
        }
        
        return false;
    }
    
    
    
    
    
    
    
    
}
