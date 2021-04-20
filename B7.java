class SinhVien {
	String name;
	int age;
	public SinhVien(String name,int age){
	    this.name = name;
	    this.age = age;
    }
    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

public class B7 {
    public static void main(String[] args) {
        SinhVien[] s = new SinhVien[3];
        s[0] = new SinhVien("Tuan", 24);
        s[1] = new SinhVien("Cuong", 25);
        s[2] = new SinhVien("Duc", 24);
        for (int i = 0; i < 3; i++) {
            s[i].Display();
        }
    }
}
