package Arrays.easy;

import java.util.Set;
import java.util.TreeSet;

public class union {
    static void common(int [] arr1, int [] arr2,int n , int m){
        Set<Integer> st=new TreeSet<>();
        for (Integer num : arr1) {
            st.add(num);
        }
        for (Integer num : arr2) {
            st.add(num);
        }
        for (Integer integer : st) {
            System.out.print(integer+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={2,3,4,4,5};
        common(arr1, arr2, arr1.length, arr2.length);
    }
}
