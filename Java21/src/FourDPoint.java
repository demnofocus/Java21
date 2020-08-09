/*
   Day 05
   Exercise
*/
import java.awt.Point;

class FourDPoint extends Point{
    int z;
    int j;
    
    FourDPoint(int x, int y, int z, int j){
        super(x,y);
        this.z = z;
        this.j = j;
    }

    @Override
    public String toString() {
        return "FourDPoint{" + "x = " + super.x + ", y = " + super.y + ", z = " + z + ", j = " + j + "}";
    }
}