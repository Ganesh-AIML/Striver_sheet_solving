package Arrays.easy;

public class missing_no {
    static void find1(int []arr, int n){
        int m=arr[n-1];
        int ans=m*(m+1)/2;
        for (int i : arr) {
            ans-=i;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        find1(arr,arr.length);
    }
}
