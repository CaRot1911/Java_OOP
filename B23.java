class Employ{
    private String name;
    private int salary;
    public Employ(String name,int salary){
        this.name  = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employ{
    private int bonus;
    public Manager(String name,int salary,int bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary()+bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }


    public void display() {
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
    }
}
public class B23 {
    public static void main(String[] args) {
        Manager m =new Manager("Duong",1200,2000);
        m.display();
    }
}
