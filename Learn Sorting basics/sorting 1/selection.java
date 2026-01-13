public class selection {
    static void selection_sort(int [] arr,int n){
        for (int i = 0; i < arr.length-1; i++) {
            int min_value=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_value]){
                    min_value=j;
                }
            }
            int temp=arr[i];
                arr[i]=arr[min_value];
                arr[min_value]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={7,8,5,4,9,2,3,1};
        int n=8;
        selection_sort(arr, n);
    }
}
