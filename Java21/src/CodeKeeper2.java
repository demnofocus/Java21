
import java.util.ArrayList;
import java.util.Iterator;

public class CodeKeeper2{
    ArrayList<String> list;     //generics
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};
    
    public CodeKeeper2(String[] userCodes){
        list = new ArrayList<>();
        // load build-in codes
        for (String code : codes) {
            addCode(code);
        }
        // load user codes
        for (String userCode : userCodes) {
            addCode(userCode);
        }
        // display all codes
        list.forEach((output) -> {
            System.out.println(output);
        });
    }
    
    private void addCode(String code){
        if(!list.contains(code)){
            list.add(code);
        }
    }
    
    public static void main(String[] arguments){
        CodeKeeper2 keeper = new CodeKeeper2(arguments);
    }
}