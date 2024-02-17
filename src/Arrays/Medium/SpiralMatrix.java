package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int r = matrix.length;
        int c = matrix[0].length;
        int rStart = 0, cStart = 0;

        while (rStart < r && cStart < c) {
            // Transverse right side
            for (int i = cStart; i < c; i++) {
                list.add(matrix[rStart][i]);
            }
            rStart++;

            // Transverse down
            for (int i = rStart; i < r; i++) {
                list.add(matrix[i][c - 1]);
            }
            c--;

            // Transverse left
            if (rStart < r) {
                for (int i = c - 1; i >= cStart; i--) {
                    list.add(matrix[r - 1][i]);
                }
                r--;
            }

            // Transverse up
            if (cStart < c) {
                for (int i = r - 1; i >= rStart; i--) {
                    list.add(matrix[i][cStart]);
                }
                cStart++;
            }
        }

        return list;

    }

}
