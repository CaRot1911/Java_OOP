class Array{
    public static int sumOfArray(int[] a){
        int s = 0;
        for(int i=0;i<a.length;i++)
        {
            s = s + a[i];
        }
        return s;
    }
    public static double sumOfArray(double[] a){
        double d = 0;
        for(int i=0;i<a.length;i++){
            d = d + a[i];
        }
        return d;
    }
}
public class B9 {
    public static void main(String[] args) {
        int[] a =new int[] {1,2,3,4,5,6};
        double[] d = new double[]{1,2,3,4,5,6};
        System.out.println(Array.sumOfArray(a));
        System.out.println(Array.sumOfArray(d));

    }
}
