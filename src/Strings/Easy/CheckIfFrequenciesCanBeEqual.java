package Strings.Easy;

import java.util.HashMap;

public class CheckIfFrequenciesCanBeEqual {

    public static void main(String[] args) {
        String s = "xxxxyyyyzz";

        boolean result = sameFreq(s);
        System.out.println(result);
    }

    static boolean sameFreq(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        //filling the map with the data
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i),1);
        }
        for(int i=0;i<map.size();i++){

        }

        return true;
    }

}
