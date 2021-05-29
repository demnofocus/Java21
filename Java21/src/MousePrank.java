
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;

/*
 * Day 12
 */

/**
 *
 * @author kevin
 */
public class MousePrank extends JFrame implements ActionListener{
    public MousePrank(){
        super("Message");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(420, 220);
        BorderLayout border = new BorderLayout();
        super.setLayout(border);
        JLabel message = new JLabel("Click OK to close this program");
        super.add(BorderLayout.NORTH, message);
        PrankPanel prank = new PrankPanel();
        prank.ok.addActionListener(this);
        super.add(BorderLayout.CENTER, prank);
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
    @Override
    public Insets getInsets(){
        return new Insets(40, 10, 10, 10);
    }
    
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf"
                    + ".nimbus.NimbusLookAndFeel");
        } catch (Exception exc){
            System.err.println("Couldn't use the system look and feel: " + exc);
        }
    }
    
    public static void main(String[] args){
        MousePrank.setLookAndFeel();
        MousePrank mousePrank = new MousePrank();
    }
}

class PrankPanel extends JPanel implements MouseMotionListener {
    JButton ok = new JButton("ok");
    int buttonX, buttonY, mouseX, mouseY;
    int width, height;
        
    PrankPanel() {
        super();
        super.setLayout(null);
        super.addMouseMotionListener((MouseMotionListener) this);
        buttonX = 110;
        buttonY = 110;
        ok.setBounds(new Rectangle(buttonX, buttonY, 70, 20));
        super.add(ok);            
    }
        
    @Override
    public void mouseMoved(MouseEvent event){
        mouseX = event.getX();
        mouseY = event.getY();
        width = (int)getSize().getWidth();
        height = (int)getSize().getHeight();
        if((Math.abs(mouseX + 35) - buttonX) < 50){
            buttonX = moveButton(mouseX, buttonX, width);
            repaint();
        }
            
        if((Math.abs(mouseY + 10) - buttonY) < 50){
            buttonY = moveButton(mouseY, buttonY, height);
            repaint();
        }
    }
        
    @Override
    public void mouseDragged(MouseEvent event){
        //ignore this event
    }
        
    private int moveButton(int mouseAt, int buttonAt, int border){
        if(buttonAt < mouseAt){
            buttonAt--;
        }else{
            buttonAt++;
        }if (buttonAt > border - 20){
            buttonAt = 10;
        }if(buttonAt < 0){
            buttonAt = border - 80;
        }
        return buttonAt;
    }
    
    @Override
    public void paintComponent(Graphics comp){
        super.paintComponent(comp);
        ok.setBounds(buttonX, buttonY, 70, 20);
    }
}   


