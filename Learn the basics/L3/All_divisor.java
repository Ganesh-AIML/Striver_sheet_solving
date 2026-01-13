package L3;

import java.util.ArrayList;
import java.util.List;

public class All_divisor {
    static void divisor(int n){
        List<Integer> res= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                res.add(i);
            }
        }
        for (int value : res) {
            System.out.print(value +" ");
        }
    }
    public static void main(String[] args) {
        divisor(36);
    }
}
