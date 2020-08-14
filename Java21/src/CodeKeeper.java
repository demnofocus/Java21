/*
    Day 08
*/
import java.util.ArrayList;
import java.util.Iterator;

public class CodeKeeper{
    ArrayList list;
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};
    
    public CodeKeeper(String[] userCodes){
        list = new ArrayList();
        // load build-in codes
        for (String code : codes) {
            addCode(code);
        }
        // load user codes
        for (String userCode : userCodes) {
            addCode(userCode);
        }
        // display all codes 
        for(Iterator ite = list.iterator(); ite.hasNext();){
            String output = (String) ite.next();
            System.out.println(output);
        }
    }
    
    private void addCode(String code){
        if(!list.contains(code)){
            list.add(code);
        }
    }
    
    public static void main(String[] arguments){
        CodeKeeper keeper = new CodeKeeper(arguments);
    }
}