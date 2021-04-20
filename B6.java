public class B6 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area: "+c.getArea());
        System.out.println("Circumference: "+c.getCircumference());
    }
}
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getCircumference(){
        return 2*3.14*radius;
    }
}