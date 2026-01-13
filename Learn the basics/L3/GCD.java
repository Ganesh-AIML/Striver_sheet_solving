package L3;

import java.util.Scanner;

public class GCD {
    static void gcd(int a, int b){
        int small=Math.min(a, b);
        int big=Math.max(a, b);
        int gcd=0;
        for (int i = 1; i <= small; i++) {
            if (small%i==0 && big%i==0) {
                gcd=i;
            }
        }
        System.out.println("GCD is = " + gcd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number : ");
        int a=sc.nextInt();
        System.out.println("enter the 2st number : ");
        int b=sc.nextInt();
        gcd(a, b);
    }
}
