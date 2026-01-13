package Arrays.easy;

public class maximum_count {
    static void maximum(int [] arr, int n){
        int max=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;
                max=Math.max(max, count);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int []arr={1, 1, 0, 1, 1, 1};
        maximum(arr, arr.length);
    }
}
