package L3;

import java.util.Scanner;

public class reverse_number{
    static int reverse(int n){
        boolean sign=false;
        int output=0;
        if (n<0) {
            sign=true;
            n*=-1;
        }
        while(n>0){
            output=output*10 + n%10;
            n=n/10;
        }
        if (sign) {
            output*=-1;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}
