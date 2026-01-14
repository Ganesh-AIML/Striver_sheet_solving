package Arrays.medium;

public class sort_3pointer{
    static void sort(int [] arr,int n ){
        int i=0,j=0,k=n-1;
        while(j<k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else if(arr[j]==1){
                j++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={1, 0, 2, 1, 0};
        sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
