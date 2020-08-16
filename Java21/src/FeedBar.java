
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 10
*/
public class FeedBar extends JFrame {
    public FeedBar(){
        super("FeedBar");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        //create icons
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
        //create buttons
        JButton load = new JButton("Load", loadIcon);
        JButton save = new JButton("Save", saveIcon);
        JButton subscribe = new JButton("Subscribe", subscribeIcon);
        JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
        //add buttons to toolbar
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(subscribe);
        bar.add(unsubscribe);   
        //prepare user interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        super.setLayout(bord);
        super.add("North", bar);
        super.add("Center", scroll);
        super.pack();
        super.setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception e){
            System.err.println("Couldn't use the system look and feel:" + e);
        }
    }
    
    public static void main(String[] arguments){
        FeedBar frame = new FeedBar();
    }
}