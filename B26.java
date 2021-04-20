class PeRSon{
    private String name;
    private String adderss;
    public PeRSon(String name,String adderss){
        this.name = name;
        this.adderss = adderss;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getAdderss() {
        return adderss;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+adderss);
    }
}
class EmpLoyee extends PeRSon{
    private int salary;
    EmpLoyee(String name,String address,int salary){
        super(name,address);
        this.salary = salary;
    }


    public void display() {
        System.out.println("Employee name: "+super.getName());
        System.out.println("Employee address: "+super.getAdderss());
        System.out.println("Employee salary: "+salary);
    }
}
class  Customer extends PeRSon{
    private int balance;
    Customer(String name,String address,int balance){
        super(name,address);
        this.balance = balance;
    }
    public void display(){
        System.out.println("Customer name: "+super.getName());
        System.out.println("Customer address: "+super.getAdderss());
        System.out.println("Customer balance: "+balance);
    }
}
public class B26 {
    public static void main(String[] args) {
        PeRSon p1 = new EmpLoyee("Trung","HN",3300);
        PeRSon p2 = new Customer("Linh", "BN", 10400);
        p1.display();
        p2.display();
    }
}
