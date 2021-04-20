import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
      Sinhvien s = new Sinhvien();
      s.getInformation();
      s.Display();

    }
}
class Sinhvien{
    private String name;
    private int age;
    public Sinhvien(){
    }

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name  = sc.next();
        age = sc.nextInt();
    }
    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
