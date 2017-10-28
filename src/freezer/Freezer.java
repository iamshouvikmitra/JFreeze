/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author SHOUVIK
 */
public class Freezer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jmf=new JFrame();
        jmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jmf.setUndecorated(true);
        jmf.setOpacity(0.1f);
        KeyListener kl=new KeyAdapter(){
            public void keyPressed(KeyEvent ke){
                if(ke.getKeyCode()==KeyEvent.VK_X){
                    System.exit(0);
                }else{
                    ke.consume();
                }
            }
        };
        jmf.addKeyListener(kl);
        Toolkit tool=Toolkit.getDefaultToolkit();
        Dimension dim=tool.getScreenSize();
        jmf.setSize(dim);
        jmf.setVisible(true);
    }
    
}
