package Exercise;

class ExerciseDay2{
    public static void main(String[] arguments){
        /*
        Day 2
        */
        
        //1
        double investment = 14000;
        double yearValue;
        
        //first year
        yearValue = investment + (investment*0.4);
        System.out.println("First year value: " + yearValue);
        //second year
        yearValue = yearValue - 1500;
        System.out.println("Second year value: " + yearValue);
        //third year
        yearValue = yearValue + (yearValue*0.12);
        System.out.println("Third year value: " + yearValue + "\n");
        
        //2
        int a = 4;
        int b = 26;
        
        System.out.println("Result when divided " + b + " by " + a + " = " + b/a + "\t Remainder = " + b%a);
        
    }
}