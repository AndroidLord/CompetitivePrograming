package Arrays.Medium;

public class RotateImage {

    public void rotate(int[][] matrix) {
       reverseMatrix(matrix);
       transposeMatrix(matrix);
    }

    void reverseMatrix(int[][] matrix) {
    
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0;i<r;i++){
            int j = -1;
            while(j++<c--){
                swap(matrix,i,j,i,c);
            }
            c = matrix[0].length;
        }
    
    }

    void transposeMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0;i<c;i++){
            for(int j=0;j<c-i;j++){
                swap(matrix,i,j,r-j-1,c-i-1);
            }
        }
    }

    void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}

