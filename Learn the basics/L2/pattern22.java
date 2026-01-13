package L2;

import java.util.Scanner;
public class pattern22 {
    static void pattern(int n){
        int start=0;
        int size=2*n-1;
        int end=size-1;
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    int top=i;
                    int left=j;
                    int bottom=end-i;
                    int right=end-j;
                    int min_dist=Math.min(Math.min(top,bottom),Math.min(right, left));
                    System.out.print(n-min_dist);
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}

/* 
pattern :-

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/