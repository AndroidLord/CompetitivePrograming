package HardQuestion;

public class LargestRectangeArea {

    public static void main(String[] args) {

        int[] arr = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(arr));


    }
    public static int largestRectangleArea(int[] heights) {


        int maxArea = 0,minheight=Integer.MAX_VALUE,i=0,j=0;

        int n = heights.length;

        for(j=0;j<n;j++){

            int len = j-i+1;
            int cur = heights[j];

            if(cur==0)
            {
                minheight=Integer.MAX_VALUE;
                i=j+1;
                continue;
            }

            minheight = Math.min(minheight,cur);

            int temp = len*minheight;

            if(temp>maxArea){
                maxArea = temp;
            }
            if(heights[j]>maxArea)
            {
                maxArea = cur;
                minheight = cur;
                i=j;
            }

        }

        return maxArea;
    }






}
