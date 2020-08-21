
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
    Day 11
*/

public class SurveyFrame extends JFrame{
    public SurveyFrame(){
        super("Survey");
        super.setSize(290, 140);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLookAndFeel();
        SurveyWizard wiz = new SurveyWizard();
        super.add(wiz);
        super.setVisible(true);    
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf"
                    + ".nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exc){
            System.err.println("Couldn't use the system look and feel: " + exc);
        }
    }
    
    public static void main(String[] arguments){
        SurveyFrame surv = new SurveyFrame();
    }
}