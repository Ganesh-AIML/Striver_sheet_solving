package L2;

import java.util.Scanner;

public class pattern7 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}

/* 
pattern :-

    *
   ** *
  *** **
 **** ***
***** ****

*/