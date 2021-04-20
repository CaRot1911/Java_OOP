interface IShape{
    double getArea();
    double getPerimeter();
}
class RecTangle implements IShape{
    private double length;
    private double width;
    public RecTangle(double length,double width){
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }
}
class CiRcle implements IShape{
    private double radius;
    public CiRcle(double radius){
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}
public class B27 {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new RecTangle(3.4, 5.3);
        shapes[1] = new CiRcle(5.5);
        shapes[2] = new RecTangle(7.4, 4.3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
        }
    }
}
