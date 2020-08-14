/*
    Day 08
*/
import java.util.BitSet;

public class HolidaySked{
    BitSet sked;
    
    public HolidaySked(){
        sked = new BitSet(365);
        int[] holiday = { 1, 15, 50, 148, 185, 246,
            281, 316, 326, 359 };       //int array
        for(int i = 0; i < holiday.length; i++){
            addHoliday(holiday[i]);
        }
    }
    
    public void addHoliday(int dayToAdd){
        sked.set(dayToAdd);
    }
    
    public boolean isHoliday(int dayToCheck){
        boolean result = sked.get(dayToCheck);
        return result;
    }
    
    public static void main(String[] args){
        HolidaySked cal = new HolidaySked();
        if(args.length>0){
            
        }
    }
}