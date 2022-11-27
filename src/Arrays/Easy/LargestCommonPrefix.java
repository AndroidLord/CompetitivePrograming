package Arrays.Easy;

import java.util.Arrays;
import java.util.Collections;

public class LargestCommonPrefix {
// complete by self, in the time limit but could be improved
    public static void main(String[] args) {
        int N = 4;
        String arr[] = {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        String result = longestCommonPrefix(arr,N);
        System.out.println(result);
    }

    static String longestCommonPrefix(String arr[], int N){
        boolean common = true;
        String result = null;

        Arrays.sort(arr);
        String shortest = arr[0];
        int n = shortest.length();

        for(int i=0;i<n;i++){
            char pointer = shortest.charAt(i);
                    for (int j=1;j<N;j++){
                        if(common) {
                            if (arr[j].charAt(i) != pointer)
                                common = false;
                        }
                        else
                            break;
                    }
            if(common)
            {
                result = shortest.substring(0,i+1);
            }
            else
                break;
        }
        if (result.length()==1)
            return "-1";

        return result;
    }



}
