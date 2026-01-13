package L2;

import java.util.Scanner;

public class pattern11 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                for (int j = 1; j < i+1; j++) {
                    if (j%2!=0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j < i+1; j++) {
                    if (j%2!=0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
                System.out.println();
            }
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

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/