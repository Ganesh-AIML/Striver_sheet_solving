package Arrays.easy;

public class longest_subarray {
    static void subarray(int [] arr, int n, int target){
        int i=0,sum=0,ans=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            if(sum>target){
                sum-=arr[i];
                i++;
            }
            if(sum==target){
                ans=Math.max(ans, j-i+1);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int [] arr={-1, 1, 1};
        subarray(arr, arr.length,1);
    }
}
