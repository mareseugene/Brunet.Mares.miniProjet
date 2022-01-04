/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_graphique_brunet_mares;

/**
 *
 * @author egnma
 */
public class Grille {
    // Attributs
    CelluleLumineuse [][] tableauDeJeu = new CelluleLumineuse[5][5];
    //CelluleLumineuse lightCourante;
    //Méthodes
    
    public  Grille() { // Initialisation d'une grille vide
        for (int i = 0; i < 5 ; i++) { // On prend la première ligne puis on initialise 
                                        // chaque colonne : de la première à la 5ème 
            for (int j = 0; j < 5; j++){
                tableauDeJeu [i][j] = new CelluleLumineuse();
        
            }
        }
    }
        public void afficherGrilleSurConsole(){
        
        for (int i = 4  ; i >= 0; i--){
            
            System.out.print("\033[30m");
            System.out.print(i+1+" "); // Affiche le numéro des lignes
            
            for (int j = 0 ; j < 5 ; j++){
                
                if (tableauDeJeu[i][j].lireEtat() == true){// si la case est allumée
                        
                        System.out.print("\033[35m O "); // on affiche en violet
                        
                    }
                
                else{ //si la case est etteinte 
                        
                        System.out.print("\033[37m O ");
                        
                    }
                
            }
            
            System.out.println(""); // permet de retourner a la ligne, pour former une grille de jeu
        }
        
        System.out.println("   1  2  3  4  5\n"); // Affiche le numéro des colonnes
    
        
        
    }
    
    public boolean lireEtat(int numLigne,int numColonne){
        
        return tableauDeJeu[numLigne][numColonne].lightCourante.Etat;
        
    }
    
        public boolean etreGagnant(){
        
        boolean toutEteint = true;
        
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                
                if (tableauDeJeu[i][j].lireEtat() == true){
                
                    toutEteint = false;
                    return toutEteint;
                }
                
            }
        }
        return toutEteint;
        
    }
    
    
    public boolean switchOnOff(int numLigne, int numColonne){
        
        // Carré central
        
        if (0 < numLigne && numLigne < 4 && 0 < numColonne && numColonne < 4){
            
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
            
        // Bas gauche
        }else if (numLigne == 0 && numColonne == 0){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        // Bas droite
        }else if (numLigne == 0 && numColonne == 4){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        // Haut Gauche
        }else if (numLigne == 4 && numColonne == 0){
            
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        // Haut droite
        }else if (numLigne == 4 && numColonne == 4){
            
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
        
            
        // Bas
        }else if (numLigne == 0 && 0 < numColonne && numColonne < 5){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        // Haut
        }else if (numLigne == 4 && 0 < numColonne && numColonne < 5){
            
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
        
        // Gauche
        }else if (0 < numLigne && numLigne < 5 && numColonne == 0){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne+1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        // Droite
        }else if (0 < numLigne && numLigne < 5 && numColonne == 4){
            
            tableauDeJeu[numLigne+1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne-1].switchEtat();
            tableauDeJeu[numLigne-1][numColonne].switchEtat();
            tableauDeJeu[numLigne][numColonne].switchEtat();
            return true;
            
        }
        
        return false;
}
}
