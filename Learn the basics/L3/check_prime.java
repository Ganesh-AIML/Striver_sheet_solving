package L3;

public class check_prime {
    static void prime(int n){
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                System.out.println("its not a prime number");
                break;
            }
            else{
                System.out.println("its a prime number");
            }
        }
    }
    public static void main(String[] args) {
        prime(8);
    }
}
