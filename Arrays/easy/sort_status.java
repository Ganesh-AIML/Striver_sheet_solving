package Arrays.easy;

public class sort_status {
    static boolean sort(int [] arr, int n){
        boolean status = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                status=false;
                break;
            }
        }
        return status;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("Is array sorted ? : "+ sort(arr,arr.length));
    }
}
