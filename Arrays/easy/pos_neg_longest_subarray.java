package Arrays.easy;

import java.util.HashMap;

public class pos_neg_longest_subarray {
    static int search(int [] arr, int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_len=0,len=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==k){
                max_len=i+1;
            }
            if(map.containsKey(sum-k)){
                len=i-map.get(sum-k);
                max_len=Math.max(max_len, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int [] arr={-1, 1, 1};
        System.out.println(search(arr, arr.length, 1));
    }
}
