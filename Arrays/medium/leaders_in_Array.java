package Arrays.medium;

public class leaders_in_Array {
    static void solution(int []arr){
        int [] ans=new int [3];
        int indx=2;
        ans[indx]=arr[arr.length-1];
        for (int i = ans.length-1; i >=0 && indx>=0; i--) {
            if(arr[i]>ans[indx]){
                ans[--indx]=arr[i];
            }

        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums={10, 22, 12, 3, 0, 6};
        solution(nums);
    }
}
