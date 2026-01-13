package Arrays.easy;

public class second {
    private static int second_large(int [] arr, int n){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
    private static int second_small(int [] arr, int n){
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                second_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }
        return second_smallest;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println(second_large(arr, n));
        System.out.println(second_small(arr, n));
    }
}
