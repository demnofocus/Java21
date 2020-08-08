package Exercise;

class ExerciseDay3{
    public static void main(String[] arguments){
        /*
            01
        */
        String birthday = "04/29/2013", month, day, year;
        month = birthday.substring(0, 2);
        day = birthday.substring(3,5);
        year = birthday.substring(6, 10);
        System.out.println("Month: " + month + "\nDay: " + day + "\nYear: " +year);
        
        /*
           02
        */ 
        Tank tank = new Tank(12,125,10);
        System.out.println("\nHeight: " + tank.height);
        System.out.println("Weight: " + tank.weight);
        System.out.println("depth: " + tank.depth);
        
    }
    
    
    
}

//02
class Tank{
        int height;
        int weight;
        int depth;
        
        Tank(int height,int weight,int depth){
            this.height = height;
            this.weight = weight;
            this.depth = depth;
        }
    }