
import java.util.HashMap;

/*
    Day 08
*/

public class ComicBooks{
    public ComicBooks(){
        //default
    }
    
    public static void main(String[] arguments){
        //set up hash map.
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        quality.put("mint", price1);
        float price2 = 2.00F;
        quality.put("near mint", price2);
        float price3 = 1.50F;
        quality.put("very fine", price3);
        float price4 = 1.00F;
        quality.put("fine", price4);
        float price5 = 0.50F;
        quality.put("good", price5);
        float price6 = 0.25F;
        quality.put("poor", price6);
        //set up collection.
        Comic[] comix = new Comic[3];
        comix[0] = new Comic("Amazing Spider-Man", "1A", 
                "very fine", 5_000.00F);
        comix[1] = new Comic("Incredible Hulk", "181", 
                "near mint", 240.00F);
        comix[2] = new Comic("Cerebus", "1A", 
                "good", 144.00F);
        
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        
        for (Comic comix1 : comix) {
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
        }
        
    }
}

class Comic{
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;
    
    Comic(String inTitle, String inIssueNumber, 
            String inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    
    void setPrice(float factor){
        price = basePrice*factor;
    }
}