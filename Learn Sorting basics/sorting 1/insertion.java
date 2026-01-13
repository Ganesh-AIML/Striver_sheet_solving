public class insertion {
    static void insertion_sort(int [] arr,int n){
        for (int i = 1; i < arr.length; i++) {
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={9,7,5,3,1,2,4,6,8};
        int n=9;
        insertion_sort(arr, n);
    }
}
