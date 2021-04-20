class customer{
    private  int id;
    private String name;
    private int discount;
    public customer(int id,String name,int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
class Invoice{
    private  int id;
    private customer customer;
    private double amount;
    public Invoice(int id,customer customer,double amount){
        this.amount = amount;
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        return amount - amount * customer.getDiscount() / 100;
    }
}
public class B32 {
    public static void main(String[] args) {
        customer customer1 = new customer(1000, "Tuan", 20);
        Invoice invoice1 = new Invoice(1000, customer1, 100000);
        System.out.println("Customer name: " + invoice1.getCustomerName());
        System.out.println("Invoice after discount: " + invoice1.getAmountAfterDiscount());
    }
}
