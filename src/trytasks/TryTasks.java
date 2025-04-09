/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trytasks;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import interfaces.*;

public class TryTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FlatArcOrangeIJTheme.setup();
        } catch (Exception e) {
            
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    
}
