package Arrays.Easy;

public class PrintArray {

    public static void print(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void printMatrix(int[][] matrix){
        System.out.print("[");
        for (int[] arr: matrix){
            for (int num:arr)
                System.out.print(num+",");
            System.out.println();
        }
        System.out.print("]");
    }

}
