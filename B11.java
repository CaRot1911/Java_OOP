class SV{
    private String name;
    private char gender;
    public SV(){
        name = "Unknown";
        gender  = 'u';
    }
    public SV(String name){
        this.name = name;
        this.gender = 'u';
    }
    public SV(char gender){
        this.name = "Unknown";
        this.gender = gender;
    }
    public SV(String name,char gender){
        this.name = name;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name: "+name);
        if(gender == 'u'){
            System.out.println("Gender: Unknown");
        }
        if (gender =='m'){
            System.out.println("Gender: Male");
        }
        if(gender=='f'){
            System.out.println("Gender: Female");
        }
    }
}
public class B11 {
    public static void main(String[] args) {

    }
}
