package Strings.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class WinnerOfAnElection {

    public static void main(String[] args) {

        int n = 3;
        String Votes[] = {"andy", "blake", "clark"};

        String[] result = winner(Votes, n);
        for (String res : result)
        {
            System.out.println(res);
        }


    }

    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> map = new HashMap<>();


        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);

            else
                map.put(arr[i],1);
        }

        int count = 0;
        int len = Integer.MAX_VALUE;
        String str = "";
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>count &&
                    arr[i].length()<=len){
                count = map.get(arr[i]);
                len = arr[i].length();
                str = arr[i];
            }
        }
        String[] res = {str,String.valueOf(count)};
        return res;
    }

}
