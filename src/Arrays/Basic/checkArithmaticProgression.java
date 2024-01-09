package Arrays.Basic;

import java.util.Arrays;

public class checkArithmaticProgression {

    public static void main(String[] args) {

    }

    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int cd = arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){

            int curCD = arr[i+1] - arr[i];
            if(curCD!=cd)
                return false;

        }
        return true;
    }

}
