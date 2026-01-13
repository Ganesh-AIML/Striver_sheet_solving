import java.util.Scanner;

public class If_Else {
    static void Condition(int n){
        if(n>0){
            System.out.println("the input is positive");
        }
        else if(n<0){
            System.out.println("the input is negative");
        }
        else{
            System.out.println("the input is zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Condition(n);
    }
}
