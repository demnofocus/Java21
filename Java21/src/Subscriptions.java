
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/*
    Day 09
*/
public class Subscriptions extends javax.swing.JFrame{
    String[] subs = { "0xDECAFBAD", "Cafe au Lait", "Hack the Planet",
        "Ideoplex", "Inessential", "Intertwingly", "Markpasc", "Postneo",
        "RC3", "Workbench" };
    JList subList = new JList(subs);
    
    public Subscriptions(){
        super("Subscriptions");
        super.setSize(150, 335);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscriptions:");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        super.add(panel);
        super.setVisible(true);
    }
    
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            System.out.println("Error: " + exc.getMessage());
        }
    }
    
    public static void main(String[] args){
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}