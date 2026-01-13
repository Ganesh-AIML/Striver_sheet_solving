public class bubble {
    static void bubble_sort(int [] arr,int n){
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j <i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={9,7,5,3,1,2,4,6,8};
        int n=9;
        bubble_sort(arr,n);
    }
}
