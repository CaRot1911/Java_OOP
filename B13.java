import java.sql.SQLOutput;

class Rec{
    private double length;
    private double width;
    public  Rec(){
    }
    public Rec(double length,double width){
        this.width = width;
        this.length = length;
    }
    public double getLenght(){
        return length;
    }
    public void setLenght(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }

}
public class B13 {
    public static void main(String[] args) {
        Rec r = new Rec(3,5);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());

    }
}
