
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TitleChanger extends JFrame implements ActionListener{
    JButton b1;
    JButton b2;
    
    public TitleChanger(){
        super("Title Bar");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        b1 = new JButton("Rosencrantz");
        b2 = new JButton("Guildenstern");
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        super.setLayout(flow);
        super.add(b1);
        super.add(b2);
        super.pack();
        super.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
      Object source = evt.getSource();
      if(source == b1){
          setTitle("Rosencrantz");
      }else if (source == b2){
          setTitle("Guildenstern");
      }
      repaint();
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf"
                    + ".nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc){
            System.err.println("Couldn't use the system look and feel: " + exc);
        }
    }
    
    public static void main(String[] args){
        TitleChanger frame = new TitleChanger();
    }
}
