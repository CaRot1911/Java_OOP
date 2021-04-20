import java.util.*;
import java.lang.Math;
class Point1{
    private int x;
    private int y;
    public Point1(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class PolyLine{
    private List<Point1> points;
    public PolyLine() {
        points = new ArrayList<Point1>();
    }
    public PolyLine(List<Point1> points){
        this.points = points;
    }
    public void appendPoint(Point1 point){
        points.add(point);
    }
    public void appendPoint(int x,int y){
        points.add(new Point1(x,y));
    }
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}
public class B33 {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(new Point1(1,1));
        polyLine.appendPoint(new Point1(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}
