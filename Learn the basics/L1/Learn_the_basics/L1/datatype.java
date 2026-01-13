import java.util.Scanner;

public class datatype {
    static void Calculate_size(){
        System.out.println("Size of the Integer : "+Integer.BYTES);
        System.out.println("Size of the Float : "+Integer.BYTES);
        System.out.println("Size of the Char : 2");
        System.out.println("Size of the Boolean : 1");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculate_size();

    }
}
