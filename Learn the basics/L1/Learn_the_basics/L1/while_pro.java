import java.util.Scanner;

public class while_pro {
    static int no_digit(int num){
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        return digit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(no_digit(num));

    }
}
