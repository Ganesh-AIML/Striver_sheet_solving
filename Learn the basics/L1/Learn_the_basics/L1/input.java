import java.util.Scanner;

public class input {
    static void Area_perimeter(int r) {
        int Area = (int) (3.14 * r * r);
        int Perimeter = (int) (2 * 3.14 * r);
        System.out.println("Area: " + Area);
        System.out.println("Perimeter: " + Perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Area_perimeter(r);
    }
}
