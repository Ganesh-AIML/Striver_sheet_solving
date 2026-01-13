public class recursion5 {
    static int[] recursion(int []arr , int n ,int i,int j){
        if(i>=j){
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return recursion(arr,n,i+1,j-1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] res= recursion(arr,arr.length,0,arr.length-1);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}