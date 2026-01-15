package Arrays.medium;

public class buy_sell {
    static void solution(int []arr){
        int max=0,min=Integer.MAX_VALUE,profit=0;
        for (int i : arr) {
            if(i<min){
                min=i;
            }
            profit=i-min;
            if(profit>max){
                max=profit;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr={7,6,4,3,1};
        solution(arr);
    }
}
