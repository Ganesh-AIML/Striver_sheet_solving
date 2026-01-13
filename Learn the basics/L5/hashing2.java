import java.util.HashMap;
import java.util.Map;

public class hashing2 {
    static int[] hashing(int [] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> e: map.entrySet()) {
            max=Math.max(max, e.getValue());
            min=Math.min(min, e.getValue());
        }
        int []arr2=new int [2];
        arr2[0]=max;
        arr2[1]=min;
        return arr2;
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,3,4,4,4,4};
        int[] res=hashing(arr);
        System.out.println("The highest occuring value in array is : "+res[0]);
        System.out.println("The lowest occuring value in array is : "+res[1]);
    }
}
