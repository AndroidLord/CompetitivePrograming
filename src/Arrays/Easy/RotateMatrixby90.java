package Arrays.Easy;

public class RotateMatrixby90 {

    public static void main(String[] args) {

        int N = 3;
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        rotateby90(matrix,N);;
//        PrintArray.printMatrix(matrix);

    }

    static void rotateby90(int matrix[][], int n)
    {
        // code here
        int[][] matrix2 = new int[n][n];
        int revColin =n-1;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                matrix2[i][j] = matrix[j][revColin];
            }
            revColin--;
        }
        matrix = matrix2.clone();
        PrintArray.printMatrix(matrix2);
        System.out.println();
        PrintArray.printMatrix(matrix);

    }

}
