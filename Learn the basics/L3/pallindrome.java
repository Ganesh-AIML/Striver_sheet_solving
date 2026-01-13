package L3;

import java.util.Scanner;

public class pallindrome {
    static boolean check(int n){
        int output=0;
        int temp=n;
        if (n<0) return false ;
        while(n>0){
            output=output*10 + n%10;
            n=n/10;
        }
        if (output==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
}
