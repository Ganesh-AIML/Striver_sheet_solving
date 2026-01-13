public class recursion3 {
    static void recursion(int n,int sum){
         if(n==0){
            System.out.println(sum);
            return;
         }
         sum+=n;
         recursion(n-1,sum);
    }
    public static void main(String[] args) {
        recursion(3,0);
    }
}
