import java.lang.Math;
class  point{
    private int x;
    private int y;
    public point(int x,int y){
        this.x =x;
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
class Line{
    private point begin;
    private point end;
    public Line(){}
    public Line(point begin,point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1,int y1,int x2,int y2){
        this.begin = new point(x1,y1);
        this.end = new point(x2,y2);
    }

    public void setBegin(point begin) {
        this.begin = begin;
    }

    public void setEnd(point end) {
        this.end = end;
    }

    public point getBegin() {
        return begin;
    }

    public point getEnd() {
        return end;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(end.getX()- begin.getX(),2)+Math.pow(end.getY()- begin.getY(),2));
    }
}
public class B29 {
    public static void main(String[] args) {
        point begin = new point(1,1);
        point end = new point(2 ,2);
        Line line1 = new Line(begin,end);
        System.out.println(line1.getLength());
        //Line line2 = new Line(2,3,5,6);
        //System.out.println(line2.getLength());
    }

}
