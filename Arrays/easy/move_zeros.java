package Arrays.easy;

public class move_zeros {
    static void move (int [] arr,int n){
        int pointer=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,0,1,0,4,0};
        move(arr,arr.length);
    }
}
