package Arrays.easy;
    public class Linear_search {
        static void search(int [] arr, int n, int target){
            int i=0,j=n-1;
            while(i<=j){
                if(arr[i]==target){
                    System.out.println(i);
                    break;
                }
                else if (arr[j]==target){
                    System.out.println(j);
                    break;
                }
                i++;
                j--;
            }
        }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        search(arr,arr.length, 5);
    }
}
