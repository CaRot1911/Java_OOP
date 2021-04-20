import java.lang.String;

class PerSon{
    private String name;
    private int dob;
    public PerSon(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getDob() {
        return dob;
    }
}
class  Stu extends PerSon{
    private double gpa;

    public Stu(String name, int dob,double gpa) {
        super(name, dob);
        this.gpa=gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
public class B20 {
    public static void main(String[] args) {
        Stu s = new Stu("Duong",22,9.0);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGpa());
    }
}
