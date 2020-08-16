
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 10
*/
public class Slider extends JFrame{
    public Slider(){
        super("Slider");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        JSlider pickNum =  new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
        pickNum.setMajorTickSpacing(10);
        pickNum.setMinorTickSpacing(1);
        pickNum.setPaintTicks(true);
        pickNum.setPaintLabels(true);
        super.add(pickNum);
        super.pack();
        super.setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception e){
            System.err.println("Couldn't use the system look and feel: " + 
                    e);
        }
    }
    
    public static void main(String[] arguments){
        Slider frame = new Slider();
    }
}