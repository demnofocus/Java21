package org.kevin.exercises;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ExerciseDay10 extends JFrame{
    JProgressBar progress;
    private final JLabel label = new JLabel("  Loading:");
    JTextField currentProgress = new JTextField();
    int num = 0;
    
    public ExerciseDay10(){
        super();
        String title = JOptionPane.showInputDialog(null,
                "Enter the title name:");
        super.setTitle(title);
        super.setSize(300, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        JPanel pane = new JPanel();
        progress = new JProgressBar(0, 100);
        pane.setLayout(new GridLayout(1, 2));
        pane.add(label);
        pane.add(currentProgress);
        super.setLayout(new GridLayout(2, 1));
        super.add(progress);
        super.add(pane);
        this.setLookAndFeel();
        //super.setVisible(true);
        
    } 

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf."
                    + "nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exc){
            System.err.println("Couldn't use the system look and feel:" + exc);
        }
    }
    
    private void iterate(){
        do{
            progress.setValue(num);
            this.currentProgress.setText(String.valueOf(num)+"%");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                //ignore
            }
            num += 25;
        }while(num<=100);
    }
    
    public static void main(String[] args){
        ExerciseDay10 frame = new ExerciseDay10();
        frame.setVisible(true);
        frame.iterate();
    }
}