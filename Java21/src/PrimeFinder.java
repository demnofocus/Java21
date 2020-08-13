/*
    Day 07
*/

public class PrimeFinder implements Runnable{
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;
    
    PrimeFinder(long inTarget) throws NegativeNumberException{
        try{
            if(inTarget<0){
                throw new NegativeNumberException("Invalid argument! "
                        + "Argument was negative!"); //Exercise 01
            }
            target = inTarget;
            if(runner == null){
            runner = new Thread(this);
            runner.start();
            }
        }catch(NegativeNumberException nne){
           System.out.println("Error: " + nne.getMessage());
        }
        
    }
    @Override
    public void run() {
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target){
            if(isPrime(candidate)){
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }
    
    
    boolean isPrime(long checkNumber){
        double root = Math.sqrt(checkNumber);
        for(int i = 2; i <= root; i++){
          if(checkNumber % i == 0){
              return false;             //checking if the number is divisible
                                        //by any other number less than its root
          }  
        }
        return true;
    }

    public static class NegativeNumberException extends Exception{
        public NegativeNumberException() {
        }
        public NegativeNumberException(String msg) {
            super(msg);
        }
    }
    
}