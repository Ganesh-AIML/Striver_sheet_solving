package Arrays.medium;

public class majority_element {
    static int count(int [] nums, int n){
        int count=0,element=0,avg=n/2;
        for(int num:nums){
            if(count==0){
                element=num;
                count++;
            }
            else if(num==element){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num:nums){
            if(num==element){
                count++;
            }
            if(count> avg){
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={2, 2, 1, 1, 1, 2, 2};
        count(arr,arr.length);
    }
}
