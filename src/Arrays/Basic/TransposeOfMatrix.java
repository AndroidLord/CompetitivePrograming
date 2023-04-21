package Arrays.Basic;

public class TransposeOfMatrix {

    // Working, self done
    static void transpose(int matrix[][], int n)
    {
        int count = 0;
        for(int i=count;i<n;i++){

            for(int j=count;j<n;j++){

                if(i!=j){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                }


            } count++;

        }

    }


}
