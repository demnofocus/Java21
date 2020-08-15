
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/*
    Day 09
*/
public class FormatFrame2 extends javax.swing.JFrame{
    String[] formats = {"Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0"};
    JComboBox formatBox = new JComboBox(formats);
    
    public FormatFrame2(){
        super("Choose a Format");
        super.setSize(220, 150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel();
        JLabel formatLabel = new JLabel("Output formats:");
        pane.add(formatLabel);
        pane.add(formatBox);
        super.add(pane);
        super.setVisible(true);
    }
    
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf."
                    + "nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            System.out.println("Error: " + exc.getMessage());
        }
    }
    
    public static void main(String arguments[]){
        FormatFrame2.setLookAndFeel();
        FormatFrame2 ff = new FormatFrame2();
    }
    
}