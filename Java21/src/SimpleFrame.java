
import javax.swing.JFrame;
import javax.swing.UIManager;

public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        super("Frame Title");
        super.setSize(300, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        super.setVisible(true);
    }

    private static void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e){
            //ignore error
        }
    }
    
    public static void main(String[] args){
        setLookAndFeel();
        SimpleFrame sf = new SimpleFrame();
    }
}