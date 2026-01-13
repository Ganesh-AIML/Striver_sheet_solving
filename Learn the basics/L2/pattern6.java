package L2;

import java.util.Scanner;

public class pattern6 {
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

/* 
pattern :-

12345
1234
123
12
1

*/