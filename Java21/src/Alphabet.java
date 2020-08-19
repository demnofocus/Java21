
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 11
*/

public class Alphabet extends JFrame{
    public Alphabet(){
        super("Alphabet");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        super.setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        super.setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Burglar");
        JButton c = new JButton("Corpse");
        JButton d = new JButton("Deadbeat");
        JButton e = new JButton("Evidence");
        JButton f = new JButton("Fugitive");
        super.add(a);
        super.add(b);
        super.add(c);
        super.add(d);
        super.add(e);
        super.add(f);
        super.setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf"
                    + ".nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exc){
            System.err.println("Couldn't use the system look and feel:" +  exc);
        }
    }
    
    public static void main(String[] arguments){
        Alphabet frame = new Alphabet();
    }
}