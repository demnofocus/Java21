
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 10
*/

public class FeedInfo extends JFrame{
    private JLabel nameLabel = new JLabel("Name: " + SwingConstants.RIGHT);
    private JTextField name;
    private JLabel urlLabel = new JLabel("URL: " + SwingConstants.RIGHT);
    private JTextField url;
    private JLabel typeLabel = new JLabel("Type: " + SwingConstants.RIGHT);
    private JTextField type;
    
    public FeedInfo(){
        super("Feed Information");
        super.setSize(400, 145);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        //Site name
        String response1 = JOptionPane.showInputDialog(null,
                "Enter the site name:");
        name = new JTextField(response1, 20);
        
        //Site address
        String response2 = JOptionPane.showInputDialog(null, 
                "Enter the site address");
        url = new JTextField(response2, 20);
        
        //Site type
        String[] choices = { "Personal", "Commercial", "Unknown" };
        int response3 = JOptionPane.showOptionDialog(null,
                "What type of site is it?", 
                "Site Type",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);    //default selection
        type = new JTextField(choices[response3], 20);
        
        super.setLayout(new GridLayout(3, 2));
        super.add(nameLabel);
        super.add(name);
        super.add(urlLabel);
        super.add(url);
        super.add(typeLabel);
        super.add(type);
        this.setLookAndFeel();
        super.setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing."
                    + "plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception e){
            System.err.println("Couldn't use the system look and feel: " + 
                    e);
        }
    }
    
    public static void main(String[] arguments){
        FeedInfo frame = new FeedInfo();
    }
    
}