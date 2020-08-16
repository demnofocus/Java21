
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 10
*/

public class TabPanels extends JFrame{
    public TabPanels(){
        super("Tabbed Panes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        super.setSize(480, 218);
        JPanel mainSettings = new JPanel();
        JPanel advancedSettings = new JPanel();
        JPanel privacySettings = new JPanel();
        JPanel emailSettings = new JPanel();
        JPanel securitySettings = new JPanel();
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Main", mainSettings);
        tabs.addTab("Advanced", advancedSettings);
        tabs.addTab("Privacy", privacySettings);
        tabs.addTab("E-mail", emailSettings);
        tabs.add("Security", securitySettings);
        super.add(tabs);
        super.setVisible(true);
    }
    
    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf."
                    + "nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception e){
            System.err.println("Couldn't use the system look and feel:" + e);
        }
    }

    public static void main(String[] args){
        TabPanels frame = new TabPanels();
    }
}