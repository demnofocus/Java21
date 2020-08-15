package org.kevin.exercises;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/*
    Day 09 Exercise
*/

public class DVR extends javax.swing.JFrame{
    JButton play = new JButton("Play");
    JButton stop = new JButton("Stop/Eject");
    JButton rewind = new JButton("Rewind");
    JButton fastForward = new JButton("Fast-forward");
    JButton pause = new JButton("Pause");
    
    public DVR(){
        super("DVR");
        super.setSize(440,80);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel();
        pane.add(play);
        pane.add(stop);
        pane.add(rewind);
        pane.add(fastForward);
        pane.add(pause);
        super.add(pane);
        super.setVisible(true);  
    }
    
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            System.out.println("Error: " + exc.getMessage());
        }
    }
    
    public static void main(String[] arguments){
        DVR.setLookAndFeel();
        DVR controller = new DVR();
    }
}