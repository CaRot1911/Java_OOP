import java.util.Scanner;

class student{
    int age;
    String name;
    public void getInformaition(){
        Scanner sc  = new Scanner(System.in);
        name   = sc.next();
        age = sc.nextInt();
    }
    public void getDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
public class B1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.getInformaition();
        s1.getDisplay();
    }
}