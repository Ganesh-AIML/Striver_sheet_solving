package Arrays.medium;

public class spiral_matrix {
    static void spial(int [][] matrix){
        int top=0,left=0,cnt=0;
        int bottom=matrix.length-1,right=matrix[0].length-1;
        int [] output=new int[matrix.length * matrix[0].length];
        while(left<=right && top<=bottom){
            for (int i = left; i <= right; i++) {
                output[cnt]=matrix[top][i];
                cnt++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                output[cnt]=matrix[i][right];
                cnt++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                output[cnt]=matrix[bottom][i];
                cnt++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                output[cnt]=matrix[i][left];
                cnt++;
            }
            left++;
        }
        for (int i : output) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        spial(matrix);
    }
}
