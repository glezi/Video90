/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video90;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author gleez
 */
public class Video90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoArea mimarco=new MarcoArea(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoArea extends JFrame {
    
    public MarcoArea(){
        setBounds(500,300,500,300);
        LaminaArea miLamina=new LaminaArea();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel{
    public LaminaArea(){
         miarea = new JTextArea(8,20);
        JScrollPane laminaBarras = new JScrollPane(miarea);
       // miarea.setLineWrap(true); 
        add(laminaBarras);
        
        JButton miboton = new JButton("Dale"); 
        miboton.addActionListener(new GestionaArea()); 
        add(miboton);
        
    }
private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           //To change body of generated methods, choose Tools | Templates.
           
           System.out.println(miarea.getText());
        }
    
    }
        private JTextArea miarea; 

}