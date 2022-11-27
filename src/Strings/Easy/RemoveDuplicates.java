package Strings.Easy;

import java.util.HashMap;

public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    String removeDups(String s) {

        HashMap<Character,Boolean> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),false);
        }

        String res = "";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) &&
                    !map.get(s.charAt(i)))
            {
                res +=s.charAt(i);
                map.put(s.charAt(i),true);
            }
        }
        return res;
    }

    //https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Strings&sortBy=submissions
}
