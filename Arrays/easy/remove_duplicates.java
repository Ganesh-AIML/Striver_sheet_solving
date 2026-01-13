package Arrays.easy;

public class remove_duplicates {
    static void remove(int[] arr,int n){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[j-1]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,3};
        remove(arr,arr.length);
    }
}
