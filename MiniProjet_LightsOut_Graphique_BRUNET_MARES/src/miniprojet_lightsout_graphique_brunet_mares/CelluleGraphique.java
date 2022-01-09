/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightsout_graphique_brunet_mares;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author egnma
 */
public class CelluleGraphique extends JButton{
    CelluleLumineuse celluleAssociee ;
    ImageIcon img_claire = new javax.swing.ImageIcon(getClass().getResource("/images/Case_claire_vf.png"));
    ImageIcon img_foncee = new javax.swing.ImageIcon(getClass().getResource("/images/Case_foncee_vf.png"));
    
    public CelluleGraphique (CelluleLumineuse uneCellule){
        celluleAssociee = uneCellule ;
        
    }
    
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        setIcon(img_claire); // On attribue image claire
    }
    
}
