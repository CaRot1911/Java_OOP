class Person2 {
    private String name;
    private String gender;

    public Person2(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}
class STU extends Person2{
    private int salary;
    public STU(String name,String gender,int salary){
        super(name,gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}
public class B21 {
    public static void main(String[] args) {
        STU s =new STU("Trung","Male",1700);
        s.display();
    }
}
