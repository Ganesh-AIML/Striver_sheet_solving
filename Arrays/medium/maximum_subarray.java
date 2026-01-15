package Arrays.medium;

public class maximum_subarray {
    static int solution(int [] nums){
        int sum=0,ans=Integer.MIN_VALUE;
        for (int i : nums) {
            sum+=i;
            ans=Math.max(sum,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={-2, -3, -7, -2, -10, -4};
        System.out.print(solution(nums));
    }
}
