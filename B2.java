import java.util.Scanner;

class  Rectangle{
    double length;
    double width;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public void Display(){
        double Area = length*width;
        double Perimeter = (length+width)*2;
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);
    }
}
public class B2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.Display();
    }

}
