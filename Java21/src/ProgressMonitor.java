
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/*
    Day 10
*/
public class ProgressMonitor extends JFrame{
    JProgressBar current;
    JTextArea out;
    JButton find;
    Thread runner;
    int num = 0;
    
    public ProgressMonitor(){
        super("Progress Monitor");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        super.setSize(205, 68);
        super.setLayout(new FlowLayout());
        current = new JProgressBar(0, 200);
        current.setValue(0);
        current.setStringPainted(true);
        super.add(current);
    }
    
    private void iterate(){
        while(num<200){
            current.setValue(num);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                //ignore
            }
            num += 95;
        }
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
    
    public static void main(String[] arguments){
        ProgressMonitor frame = new ProgressMonitor();
        frame.setVisible(true);
        frame.iterate();
    }
}