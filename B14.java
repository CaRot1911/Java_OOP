class sv{
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;
    public sv(){

    }
    public sv(int id,String name,int age,String address,int score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address =address;
        this.setScore(score);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getScore(){

        return score;
    }
    public void setScore(int score){
        if (score<0){
            this.score = 0;
        }
        else if (score>10){
            this.score = 10;
        }
        else {
            this.score = score;
        }
    }
}
public class B14 {
    public static void main(String[] args) {
        sv s = new sv(1001,"Duong",21,"Ha Noi",10);
        System.out.println("Id: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Address: "+s.getAddress());
        System.out.println("Score: "+s.getScore());
    }
}
