package L2;

import java.util.Scanner;

public class pattern15 {
    static void pattern(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
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

ABCDE
ABCD
ABC
AB
A

*/