public class recursion8 {
    static void recursion(int n,int a,int b){
        if (n==2) {
            return;
        }
        System.out.print(a+b+" ");
        recursion(n-1, b,a+b);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a +" "+b+" ");
        recursion(6,a,b);
    }
}
