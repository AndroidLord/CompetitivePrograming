package Strings.Medium;

import java.util.HashMap;

public class LongestStringWithoutRepeatingCharacter {


    public static void main(String[] args) {

        String t= "pwwkew";

        System.out.println(lengthOfLongestSubstring(t));

    }


    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int l=0;
        int maxlen = 0;

        for(int r=0;r<s.length();r++)
        {

            char cur = s.charAt(r);

            if(map.containsKey(cur)){
                char rem = s.charAt(l);
                map.remove(rem);
                l++;
                r--;
            }
            else{

                map.put(cur,1);

            }

            maxlen = Math.max(maxlen,r-l+1);

        }


        return maxlen;
    }







}
