class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int id,String firstName,String lastName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void  setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firstName +" "+ lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void Display(){
        System.out.println("Id: "+getId());
        System.out.println("FullName: "+getFullName());
        System.out.println("Salary: "+getSalary());
    }
}
public class B15 {
    public static void main(String[] args) {
        Employee e = new Employee(1001,"Manh","Duong",1200);
        e.Display();
    }
}
