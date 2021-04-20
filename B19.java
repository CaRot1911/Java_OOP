class Account{
    private int id;
    private String name;
    private int balance;
    public Account(){

    }
    public Account(int id,String name){
        this.id = id;
        this.name = name;
    }
    public Account(int id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        System.out.println("Balance: "+(balance+amount));

    }
    public void withdraw(int amount){
        if(balance>amount){
            System.out.println("So tien ban rut la: "+amount);
            System.out.println("So du thai khoan la: "+(balance-amount));
        }
        else{
            System.out.println("That amount exceeds your current balance.");
        }
    }
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
public class B19 {
    public static void main(String[] args) {
        Account a = new Account(1001,"Tuan",2490);
        a.display();
        a.deposit(1000);
        a.withdraw(1000);
    }
}
