package Arrays.medium;

import java.util.ArrayList;

public class permutation_integer {
    static ArrayList<ArrayList<Integer>> permutation(int [] nums){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(), result);
        return result;
    }
    static void backtrack(int [] nums ,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> result){
        if(cur.size() == nums.length){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(cur.contains(nums[i])) continue;
            cur.add(nums[i]);
            backtrack(nums, cur, result);
            cur.remove(cur.size()-1);
        }
    }
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(permutation(nums));
    }
}
