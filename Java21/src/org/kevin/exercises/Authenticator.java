package org.kevin.exercises;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/*
    Day 09
*/
public class Authenticator extends javax.swing.JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");
    
    public Authenticator(){
        super("Account Information");
        super.setSize(300, 220);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
       
        pane.add(ok);
        pane.add(cancel);
        
        super.add(pane);
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
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}