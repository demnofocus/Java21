
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
    Day 09
*/
public class IconFrame extends JFrame{
    JButton load, save, subscribe, unsubscribe;
    
    public IconFrame(){
        super("Icon Frame");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        
        //creat icons
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
        
        //create buttons
        load = new JButton("Load", loadIcon);
        save = new JButton("Save", saveIcon);
        subscribe = new JButton("Subscribe", subscribeIcon);
        unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
        
        //add button to panel
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);
        
        //add the panel to a frame
        super.add(panel);
        super.pack();
        super.setVisible(true);
    }
    
    public static void main(String[] args){
        IconFrame ike = new IconFrame();
    }
}