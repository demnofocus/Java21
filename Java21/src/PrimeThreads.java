public class PrimeThreads{
    public static void main(String[] arguments){
        PrimeThreads pt = new PrimeThreads(arguments);
    }
    
    public PrimeThreads(String[] args){
        PrimeFinder[] finder = new PrimeFinder[args.length];
        for(int i = 0; i < args.length; i++){
            try{
                long count = Long.parseLong(args[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Looking for prime " + count );
            }catch(NumberFormatException nfe){
                System.out.println("Error: " + nfe.getMessage());
            }
        }
        boolean complete = false;
        while(!complete){
            complete = true;
            for(int j = 0; j < finder.length; j++){
                if(finder[j] == null) continue;
                if(!finder[j].finished){
                    complete = false;
                }else{
                    finder[j] = null;
                }
            }
            
        }
    }
}