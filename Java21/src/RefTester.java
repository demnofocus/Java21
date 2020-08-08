
import java.awt.Point;

class RefTester{
    public static void main(String[] arguments){
        Point pt1, pt2, pt3;
        pt1 = new Point(100, 100);
        pt2 = pt1.getLocation();        //copying
        pt3 = pt1;                      //reference
        
        pt1.x = 200;
        pt1.y = 200;
        System.out.println("Point1: " + pt1.x + "," + pt1.y);
        System.out.println("Point2: " + pt2.x + "," + pt2.y);
        System.out.println("Point3: " + pt3.x + "," + pt3.y);
    }
}