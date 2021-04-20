class HocSinh{
    private String name;
    private String address;
    private double gpa;
    public HocSinh(String name,String address,double gpa){
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    public String toString(){
        return "Name: "+name +", Address: "+address +", GPA: "+gpa;
    }
}
public class B24 {
    public static void main(String[] args) {
        HocSinh s = new HocSinh("Duong","Ha Noi",9.0);
        System.out.println(s);
    }
}
