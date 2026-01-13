public class recursion2 {
    static void recursion(int n,int count){
        if(n==0){
            return;
        }
        recursion(n-1, count-1);
        System.out.println(count);
    }
    public static void main(String[] args) {
        recursion(5, 5);
    }
}
