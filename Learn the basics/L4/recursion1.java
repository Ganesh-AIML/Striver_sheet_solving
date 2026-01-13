public class recursion1{
    static void recursion(int n){
        if(n==0){
            return;
        }
        n--;
        recursion(n);
        System.out.println("hello i am ganesh");
    }
    public static void main(String[] args) {
        recursion(5);
    }
}