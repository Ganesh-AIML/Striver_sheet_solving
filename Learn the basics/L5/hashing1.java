import java.util.HashMap;
import java.util.Map;

public class hashing1{
    static void hashing(int [] arr, int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " repeats "+ i.getValue()+" this time.");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,1,3,4,5,4};
        hashing(arr,arr.length);
    }
}