package org.kevin.exercises;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Grid Layouts
 */
public class ExerciseDay11 extends JFrame {
    public ExerciseDay11() {
        //Three Buttons
        super("Program");
        super.setSize(350, 225);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");
        JButton gamma = new JButton("Gamma");
        JPanel content = new JPanel();
        //answer
        content.setLayout(new FlowLayout());
        content.add(alpha);
        content.add(beta);
        content.add(gamma);
        super.add(content);
        super.pack();
        super.setVisible(true); 
    }
    
    public static void main(String[] arguments){
        ExerciseDay11 b3 = new ExerciseDay11();
    }
}
