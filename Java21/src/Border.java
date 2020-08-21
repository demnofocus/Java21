
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

/*
    Day 11
*/
public class Border extends javax.swing.JFrame{
    public Border(){
        super("Border");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(240, 280);
        this.setLookAndFeel();
        super.setLayout(new BorderLayout());
        JButton nButton = new JButton();
        JButton sButton = new JButton();
        JButton eButton = new JButton();
        JButton wButton = new JButton();
        JButton cButton = new JButton();
        super.add(nButton, BorderLayout.NORTH);
        super.add(sButton, BorderLayout.SOUTH);
        super.add(eButton, BorderLayout.EAST);
        super.add(wButton, BorderLayout.WEST);
        super.add(cButton, BorderLayout.CENTER);
        super.setVisible(true);        
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaff.nimbus.NimbusLookAndFeel");
            
        }catch(Exception exc){
            System.err.println("Couldn't use the system look and feel" + exc);
        }
    }
    
    public static void main(String[] args){
        Border frame = new Border();
    }
}