package Strings.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class WinnerOfAnElection {

    public static void main(String[] args) {


       // String Votes[] = {"andy", "blake", "clark"};
        String Votes[] = {"andy", "andy", "andy"};
        //String Votes[] = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};

        int n = Votes.length;

        String[] result = winner(Votes, n);
        for (String res : result)
        {
            System.out.println(res);
        }


    }

    public static String[] winner2(String arr[], int n)
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


    // Working, mine
    public static String[] winner(String arr[], int n)
    {

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }

        String max = arr[0];
        int mp = map.get(arr[0]);

        for(int i=1;i<arr.length;i++){

            int point = map.get(arr[i]);

            if(!max.equals(arr[i]) && point>=mp)
            {
                if(max.compareTo(arr[i])>=0 || point>mp){
                    max = arr[i];
                    mp = point;
                }


            }
        }
        return new String[]{max,String.valueOf(mp)};
    }
}
