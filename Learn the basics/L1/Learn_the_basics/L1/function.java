public class function {
    static int [] swap(int a , int b){
        int []array={b,a};
        return array;
    }
    public static void main(String[] args) {
        int a =10;
        int b=20;
        int [] ans=swap(a, b);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
