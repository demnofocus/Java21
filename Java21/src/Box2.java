import java.awt.Point;

/*
    Day 05
*/
class Box2{
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    
    Box2 buildBox(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }
    
    Box2 buildBox(Point topLeft, Point bottomRight){
        this.buildBox(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
        return this;
    }
    
    Box2 buildBox(Point topLeft, int w, int h){
        this.buildBox(topLeft.x, topLeft.y, topLeft.x + w,
                topLeft.y + w);
        return this;
    }
    
    void printBox(){
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }
    
    public static void main(String[] args){
        Box rect = new Box();
        
        System.out.println("Calling buildBox2 with " +
                "coordinates (25,25) and (50,50):");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();
        
        System.out.println("\nCalling buildBox2 with " +
                "points (10,10) and (20,20):");
        rect.buildBox(new Point(10,10), new Point(20,20));
        rect.printBox();
        
        System.out.println("\nCalling buildBox2 with " +
                "points (10,10, width 50 and height 50");
        rect.buildBox(new Point(10,10), 50, 50);
        rect.printBox();
    }
}