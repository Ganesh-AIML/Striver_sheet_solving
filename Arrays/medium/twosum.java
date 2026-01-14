package Arrays.medium;

public class twosum {
    static int [] find(int [] arr, int n,int target){
        int i=0,j=n-1,sum=0;
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum==target){
                return new int[] {i,j};
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []arr={2,6,5,8,11};
        int target=14;
        int [] res=find(arr, arr.length, target);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
