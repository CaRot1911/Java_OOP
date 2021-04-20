import java.lang.Math;
class Point{
    private double x;
    private double y;
    public Point(){
    }
    public Point(double x,double y){
        this.x = x;
        this.y=y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x,double y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(Point another){
        return distance(another.getX(),another.getY());
    }
}
public class B18 {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.distance(2,3));
        System.out.println(p.distance(3,4));
    }
}
