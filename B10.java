class ArrayCalculator{
    public static int maxOfArray(int[] a){
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
    public static double max(double[] a){
        double max = a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
    public static int minOfArray(int[] a){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(min<a[i]){
                min =a[i];
            }
        }
        return min;
    }
    public static double min(int[] a){
        double min = a[0];
        for(int i=0;i<a.length;i++){
            if(min<a[i]){
                min =a[i];
            }
        }
        return min;
    }

}
public class B10 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6};
        double[] b = new double[] {1,2,3,4,5,6};
        System.out.println(ArrayCalculator.max(b));
    }
}
