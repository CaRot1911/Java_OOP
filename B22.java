class penson{
    private String name;
    private int age;
    private String address;
    penson(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}
class hs extends penson{
    private double gpa;
    private hs(String name,int age,String address,double gpa){
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void display(){
        super.display();
        System.out.println("GPA: "+gpa);
    }
}
class Teacher extends penson{
    private int salary;
    Teacher(String name,int age,String address,int salary){
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: "+salary);
    }
}
public class B22 {
    public static void main(String[] args) {
        //hs k = new hs("Khanh",23,"Ha Noi",9.0);
        Teacher t = new Teacher("Tung",34,"Ha Noi",1700);
        t.display();
    }
}
