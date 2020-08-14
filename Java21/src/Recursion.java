/*
    Day 08
    Practice
*/

class Recursion{
    public int dex = -1;
    
    public Recursion(){
        dex = getValue(17);
    }
    
    public int getValue(int dexValue){
        if(dexValue > 100){
            return dexValue;
        }
       return getValue(dexValue*2);     //calls getValue again
    }
    
    public static void main(String[] args){
        Recursion r = new Recursion();
        System.out.println(r.dex);
    }
}