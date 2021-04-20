class Math{
    static double PI = 3.14;
    public static int abs(int x){
        return x<0?-x : x;
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int subtract(int x,int y){
        return x-y;
    }
    public static int min(int x,int y){
        return x<y ? x:y;
    }
    public static int max(int x,int y){
        return x>y ? x:y;
    }
    public static int pow(int x,int y){
        int pow = 1;
        for (int i=0;i<y;i++)
        {
            pow *=x;
        }
        return pow;
    }

}
public class B8 {
    public static void main(String[] args) {
        Math m = new Math();
        System.out.println( m.min(3,7));

    }
}

