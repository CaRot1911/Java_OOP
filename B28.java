interface IEmployee{
    int calculate();
    String getName();
}
abstract class EMployee implements IEmployee{
    private String name;
    private int peymentPerHour;
    public EMployee(String name,int peymentPerHour){
        super();
        this.name = name;
        this.peymentPerHour = peymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setPeymentPerHour(int peymentPerHour) {
        this.peymentPerHour = peymentPerHour;
    }

    public int getPeymentPerHour() {
        return peymentPerHour;
    }
}
class PartTimeEmployee extends EMployee{
    private int workingHours;
    public PartTimeEmployee(String name,int peymentPerHour,int workingHours) {
        super(name, peymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculate() {
        return workingHours*getPeymentPerHour();
    }
}
class FulltimeEmployee extends EMployee{
    public FulltimeEmployee(String name,int peymentPerHour){
        super(name, peymentPerHour);
    }

    @Override
    public int calculate() {
        return 8*getPeymentPerHour();
    }
}
public class B28 {
    public static void main(String[] args) {

    }
}
