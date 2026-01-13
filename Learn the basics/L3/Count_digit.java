package L3;
import java.util.Scanner;
public class Count_digit {
    static int count(int n){
        int digit=0;
        while(n>0){
            n=n/10;
            digit++;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
