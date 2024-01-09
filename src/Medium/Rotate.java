package Medium;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println("Before");
        for (int[] cur:matrix){
            System.out.println(Arrays.toString(cur));
        }

        rotate(matrix);

        System.out.println("AFTER");
        for (int[] cur:matrix){
            System.out.println(Arrays.toString(cur));
        }


    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] arr= new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){

            int k = n-i-1;
            for(int j=0;j<m;j++){

                matrix[j][i] = arr[k][j];

            }

        }

    }


}
