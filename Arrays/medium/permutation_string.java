package Arrays.medium;

public class permutation_string {
    static void permutation(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            permutation(left+right, ans+cur);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "");
    }
}
