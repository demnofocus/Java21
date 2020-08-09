package Exercise;

class ExerciseDay4{
    /*
        Certification Practice
    */
    static void cases(){
        float x = 10, y = 5;
        int z = (int)(x / y);
        System.out.println("Value of z: " + z);

        switch(z){
            case 1:
                x = x + 2;
                System.out.println("Value of x: " + x);
            case 2:
                x = x + 3;
                System.out.println("Value of x: " + x);
            default:
                x = x + 1;    
                System.out.println("Value of x: " + x);
            }
        System.out.println("Value of x: " + x);
    }
    
    //01
    static int countDays(int month, int year){
        int count = -1;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if(year % 4 == 0){
                    count = 29;
                }else{
                    count = 28;
                }
                if((year % 100 == 0) & (year % 400 != 0)){
                    count = 28;
                }
        }
        return count;
    }
    
    //02
    static void getLongValue(String[] arguments){
        long value = 0;
        String argument = "";
        if(arguments.length > 0){
            argument = arguments[0];
        }
        System.out.println("\narg: " + arguments.length);
        
        switch(argument){
            case "one":
                value = 1;
                break;
            case "two":
                value = 2;
                break;
            case "three":
                value = 3;
                break;
            case "four":
                value = 4;
                break;
            case "five":
                value = 5;
                break;
            case "six":
                value = 6;
                break;
            case "seven":
                value = 7;
                break;
            case "eight":
                value = 8;
                break;
            case "nine":
                value = 9;
                break;
            case "ten":
                value =10;
        }
        System.out.println(argument + " equals to " + value);
    }
    
    public static void main(String[] arguments){
       /*
         Practice
       */
       ExerciseDay4.cases();
       
       /*
         Exercise 02
       */
       ExerciseDay4.getLongValue(arguments);
       /*
         Exercise 01
       */
       //year = 2020
       String[] monthList = new String[]{"January", "February", "March", "April",
           "May", "June", "July", "August", "September", "October", "November", "December"};
       System.out.println("\nDates of 2020: ");
       for(int i = 1; i<=12; i++){
           int totalDays = ExerciseDay4.countDays(i,2020);
           for(int j=1; j<=totalDays; j++){
               System.out.println("Date: " + monthList[i-1] + " " + j);
           }
           System.out.println("*");
       }  
    }
}

