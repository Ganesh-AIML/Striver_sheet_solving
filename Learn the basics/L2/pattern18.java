package L2;

import java.util.Scanner;

public class pattern18 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print((char)('A'+(n-j-1)));
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

E
E D
E D C
E D C B
E D C B A

*/