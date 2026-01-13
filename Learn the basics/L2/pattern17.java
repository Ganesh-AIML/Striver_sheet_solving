package L2;

import java.util.Scanner;

public class pattern17 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A'+j));
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print((char)('A'+j));
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

   A
  AB A
 ABC BA
ABCD CBA

*/