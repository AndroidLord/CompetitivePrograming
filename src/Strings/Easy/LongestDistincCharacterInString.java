package Strings.Easy;

import java.util.HashMap;

public class LongestDistincCharacterInString {

    public static void main(String[] args) {
        int result = longestSubstrDistinctChars("asdfasdgvfyweofyewyrtyefgv");
        System.out.println(result);
    }

    static int longestSubstrDistinctChars(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
// my mistake is that, I am taking character and not adding the remaing left character
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i)) ){

                count = i - map.get(s.charAt(i));
                map.put(s.charAt(i),i);
                map.clear();
            }
            else{
                map.put(s.charAt(i),i);

                if(++count>max)
                max = count;

            }
        }

        return max;
    }

}
