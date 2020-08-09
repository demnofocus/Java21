class Printer{
    int x = 0;
    int y = 0;
    
    void printMe(){
        System.out.println("x is " + x + ", y is " + y);
        System.out.println("I am an instance of the class " +
                this.getClass().getName());
    }
}

class SubPrinter extends Printer{
    int z = 3;
    
    @Override
    void printMe(){
        System.out.println("x is " + x + ", y is " + y + ", z is " + z);
        System.out.println("I am an instance of the class " +
                this.getClass().getName());
    }
    
    public static void main(String[] arguments){
        SubPrinter obj1 = new SubPrinter();
        obj1.printMe();
        
        Printer obj2 = new SubPrinter();    //Upcasting
        obj2.printMe();
        
        Printer obj3 = new Printer();    
        obj3.printMe();
    }
}