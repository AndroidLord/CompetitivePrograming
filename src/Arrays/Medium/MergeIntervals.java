package Arrays.Medium;

import java.util.ArrayList;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,6}};

        arr = merge(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }

    }
    public static int[][] merge(int[][] intervals) {

        ArrayList<Pair> list = new ArrayList<>();
        int n = intervals.length;

        for(int i=0;i<n;i++){

            int f = intervals[i][0];
            int s = intervals[i][1];

            if(i+1==n){
                list.add(new Pair(f,s));
                break;
            }

            while(i+1<n){
                if(s>=intervals[i+1][0]){
                    s=Math.max(s,intervals[i+1][1]);
                    i++;
                }
                else{
                    break;
                }
            }
            list.add(new Pair(f,s));

        }

        return convertArrayListTo2DArray(list);
    }

    static class Pair{

        int first, second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }

    public static int[][] convertArrayListTo2DArray(ArrayList<Pair> list) {
        int numRows = list.size();
        int[][] array = new int[numRows][2];

        for (int i = 0; i < numRows; i++) {
            array[i][0] = list.get(i).first;
            array[i][1] = list.get(i).second;
        }

        return array;
    }

}
