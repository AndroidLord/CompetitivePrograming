package Medium;

import java.util.*;

public class MaxInternalDifference {
    public static int calculateTotalInternalDifference(List<List<Integer>> matrix) {
        int totalDiff = 0;
        int numRows = matrix.size();
        int numCols = matrix.get(0).size();

        // Calculate horizontal differences
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < numCols - 1; ++j) {
                totalDiff += Math.abs(matrix.get(i).get(j) - matrix.get(i).get(j + 1));
            }
        }

        // Calculate vertical differences
        for (int j = 0; j < numCols; ++j) {
            for (int i = 0; i < numRows - 1; ++i) {
                totalDiff += Math.abs(matrix.get(i).get(j) - matrix.get(i + 1).get(j));
            }
        }

        return totalDiff;
    }

    // Function to find the maximum possible total internal difference
    public static int maxTotalInternalDifference(List<List<Integer>> matrix) {
        int numRows = matrix.size();
        int numCols = matrix.get(0).size();

        int maxDiff = 0;

        // Try all combinations of swapping rows
        for (int i = 0; i < numRows; ++i) {
            for (int j = i + 1; j < numRows; ++j) {
                Collections.swap(matrix, i, j); // Swap rows

                maxDiff = Math.max(maxDiff, calculateTotalInternalDifference(matrix));

                Collections.swap(matrix, i, j); // Restore original arrangement of rows
            }
        }

        // Try all combinations of swapping columns
        for (int i = 0; i < numCols; ++i) {
            for (int j = i + 1; j < numCols; ++j) {
                for (int k = 0; k < numRows; ++k) {
                    Collections.swap(matrix.get(k), i, j); // Swap columns

                    maxDiff = Math.max(maxDiff, calculateTotalInternalDifference(matrix));

                    Collections.swap(matrix.get(k), i, j); // Restore original arrangement of columns
                }
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        // Example matrix A
        List<List<Integer>> A = new ArrayList<>();
        A.add(Arrays.asList(3, 1, 2));
        A.add(Arrays.asList(4, 6, 5));
        A.add(Arrays.asList(9, 7, 8));

        int maxInternalDifference = maxTotalInternalDifference(A);
        System.out.println("Maximum Total Internal Difference: " + maxInternalDifference);
    }
}
