public class lower_bound {
    static int search(int [] arr, int target){
        int n=arr.length;
        int beg=0,end=n-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(arr[mid]>=target){
                n=mid;
                end=mid-1;
            }
            else{
                beg=mid+1;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        System.out.println(search(arr, 2));
    }
}
