package L3;

public class Armstrong {
    static void solve(int n){
        int count=0;
        int temp =n;
        int sum=0;
        while (n >0) {
            n/=10;
            count++;
        }
        n=temp;
        for (int i = 0; i < count; i++) {
            sum+=Math.pow((n%10),count);
            n/=10;
        }
        if (sum==temp) {
            System.out.println("Its Armstrong number");
        }
        else{
            System.out.println("Its not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        solve(155);
    }
}
