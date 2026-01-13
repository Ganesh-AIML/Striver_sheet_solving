public class recursion4 {
    static void recursion(int n , int res){
        if(n==0){
            System.out.println(resr);
            return;
        }
        res*=n;
        recursion(n-1, res);
    }
    public static void main(String[] args) {
        recursion(5,1);
    }
}
