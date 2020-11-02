
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/*
 * Day 12
 */

/**
 *
 * @author kevin
 */
public class Calculator extends JFrame implements FocusListener{
    JTextField value1, value2, sum;
    JLabel plus, equals;
    
    public Calculator(){
        super("Add Two Numbers");
        super.setSize(350,90);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        super.setLayout(flow);
        
        //create components
        value1 = new JTextField("0", 5);
        plus = new JLabel("+");
        value2 = new JTextField("0", 5);
        equals = new JLabel("=");
        sum = new JTextField("0", 5);
        
        //add listeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        
        //set up sum field
        sum.setEditable(false);
        
        //add components
        super.add(value1);
        super.add(plus);
        super.add(value2);
        super.add(equals);
        super.add(sum);
        super.setVisible(true);

    }
    @Override
    public void focusGained(FocusEvent event) {
        try{
            float total = Float.parseFloat(value1.getText()) +
                    Float.parseFloat(value2.getText());
            sum.setText("" + total);
        }catch(Exception nfe){
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }

    @Override
    public void focusLost(FocusEvent event) {
        focusGained(event);
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
    
    public static void main(String[] arguments){
        Calculator frame = new Calculator();
    }
}
