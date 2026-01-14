package Arrays.easy;

public class unique {
    static void find(int []arr, int n){
        int xor=0;
        for (int i : arr) {
            xor^=i;
        }
        System.out.println(xor);
    }
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        find(arr, arr.length);
    }
}
