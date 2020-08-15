
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class FormatFrame extends javax.swing.JFrame{
    JRadioButton[] teams = new JRadioButton[4];     //JRadioButton array
    
    public FormatFrame(){
        super("Choose and output format");
        super.setSize(320, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teams[0] = new JRadioButton("Atom");
        teams[1] = new JRadioButton("RSS 0.92");
        teams[2] = new JRadioButton("RSS 1.0");
        teams[3] = new JRadioButton("RSS 2.0");
        JPanel panel = new JPanel();
        JLabel chooseLabel = new JLabel("Choose an output format"
                + " for the syndicated news items");
        panel.add(chooseLabel);
        ButtonGroup group = new ButtonGroup();
        for(JRadioButton team: teams){
            group.add(team);    //blocks from ticking all
            panel.add(team);
        }
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
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}