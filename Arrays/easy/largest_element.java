package Arrays.easy;

public class largest_element {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        int max=0,i=0,j=n-1;
        while(i<j){
            max=Math.max(max,Math.max(arr[i], arr[j]));
            i++;
            j--;
        }
        System.out.println(max+" ");
    }
}
