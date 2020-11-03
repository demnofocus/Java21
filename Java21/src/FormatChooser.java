
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/*
 * Day 12
 */

/**
 *
 * @author kevin
 */
public class FormatChooser extends JFrame implements ItemListener {
    String[] formats = {"(choose format)", "Atom", "RSS 0.92", "RSS 1.0",
        "RSS 2.0"};
    
    String[] descriptions = {
        "Atom weblog and syndication format",
        "RSS syndication format 0.92 (Netscape)",
        "RSS/RDF syndication format 1.0 (RSS/RDF)",
        "RSS syndication format 2.0 (Userland)"
    };

    JComboBox formatBox = new JComboBox();
    JLabel descriptionLabel = new JLabel("");
    
    public FormatChooser(){
        super("Syndication Format");
        super.setSize(420, 150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        for(String format: formats){
            formatBox.addItem(format);
        }
        formatBox.addItemListener(this);
        super.add(BorderLayout.NORTH, formatBox);
        super.add(BorderLayout.CENTER, descriptionLabel);
        super.setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        int choice = formatBox.getSelectedIndex();
        if (choice>0){
            descriptionLabel.setText(descriptions[choice-1]);
        }
    }
    
    @Override
    public Insets getInsets(){
        return new  Insets(50, 10, 10, 10);
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
        FormatChooser format = new FormatChooser();
        format.setLookAndFeel();
    }
    
}
