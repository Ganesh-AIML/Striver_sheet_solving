public class recursion7 {
    static boolean recursion(String str , int n , int i, int j){
        if(i>j){
            return true;
        }
        if (str.charAt(i)!=str.charAt(j)) {
            return false;
        }
        return recursion(str, n , i+1 , j-1);
    }
    public static void main(String[] args) {
        String str ="RACECAR";
        System.out.println(recursion(str,str.length(),0,str.length()-1));

    }
}
