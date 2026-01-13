public class Array {
    static int largest(int [] array){
        int largest=0;
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest,array[i]);
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] array={10, 5, 2, 8, 10};
        int ans=largest(array);
        System.out.println("the largest number in the array is : "+ans);
    }
}
