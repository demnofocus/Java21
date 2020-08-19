
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 11
*/
public class Stacker extends javax.swing.JFrame{
    public Stacker(){
        super("Stacker");
        super.setSize(430, 150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        // create top panel
        JPanel commandPane = new JPanel();
        BoxLayout horizontal = new BoxLayout(commandPane,BoxLayout.X_AXIS);
        JButton subscribe = new JButton("Subscribe");
        JButton unsubscribe = new JButton("Unsubscribe");
        JButton refresh = new JButton("Refresh");
        JButton save = new JButton("Save");
        commandPane.add(subscribe);
        commandPane.add(unsubscribe);
        commandPane.add(refresh);
        commandPane.add(save);
        //create bottom panel
        JPanel textPane = new JPanel();
        JTextArea text = new JTextArea(4, 70);
        JScrollPane scrollPane = new JScrollPane(text);
        //put them together
        FlowLayout flow = new FlowLayout();
        super.setLayout(flow);
        super.add(commandPane);
        super.add(scrollPane);
        super.setVisible(true);
    }

    private void setLookAndFeel() {
       try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           SwingUtilities.updateComponentTreeUI(this);
       }catch(Exception exc){
           System.err.println("Couldn't use the system look and feel: " + exc);
       }
    }
    
    public static void main(String[] args){
        Stacker st = new Stacker();
    }
}