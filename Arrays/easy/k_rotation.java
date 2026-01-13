package Arrays.easy;

public class k_rotation {
    static void reverse(int [] arr,int i , int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate_left(int [] arr,int i,int j,int k){
        reverse(arr,i,k-1);
        reverse(arr, k, j-1);
        reverse(arr, i, j-1);
        for (int k2 = 0; k2 < arr.length; k2++) {
            System.out.print(arr[k2]+" ");
        }
    }
    static void rotate_right(int [] arr,int i,int j,int k){
        reverse(arr, i, j-1);
        reverse(arr,i,k-1);
        reverse(arr, k, j-1);
        for (int k2 = 0; k2 < arr.length; k2++) {
            System.out.print(arr[k2]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        rotate_left(arr,0, arr.length, 2);
        rotate_right(arr,0, arr.length, 2);
    }
}
