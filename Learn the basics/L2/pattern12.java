package L2;

import java.util.Scanner;

public class pattern12 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        pattern(n);
    }
}

/* 
pattern :-

1       |       1
1 2     |     2 1
1 2 3   |   3 2 1
1 2 3 4 | 4 3 2 1

*/