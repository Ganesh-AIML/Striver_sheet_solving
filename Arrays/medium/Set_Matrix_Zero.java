package Arrays.medium;

public class Set_Matrix_Zero {
    static void set(int [][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        boolean first_col_zero=false;
        boolean first_row_zero=false;

        for (int i = 0; i < row; i++) {
            if(matrix[i][0]==0){
                first_col_zero=true;
            }
        }
        for (int i = 0; i < col; i++) {
            if(matrix[0][i]==0){
                first_row_zero=true;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
            }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
            }
            }
        }
        if(first_col_zero){
            for (int i = 0; i < row; i++) {
                matrix[i][0]=0;
                }
            }

        if(first_row_zero){
            for (int i = 0; i < col; i++) {
                matrix[0][i]=0;
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        set(matrix);
    }
}
