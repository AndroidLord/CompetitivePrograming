package Strings.Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MaximumOccuringCharacter {


    public static void main(String[] args) {

        String s = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";
        String s2 = "abacdef";


        char result = getMaxOccuringChar2(s);

        System.out.println(result);

    }

    // mine, working
    public static char getMaxOccuringChar(String line)
    {

        ArrayList<Character> list = new ArrayList<>();

        HashMap<Character,Integer> map = new HashMap<>();

        int count = 1;


        for(int i=0;i<line.length();i++){

            if(map.containsKey(line.charAt(i))){
                // contains

                int prev = map.get(line.charAt(i));
                map.put(line.charAt(i),prev+1);

                if((prev+1)>count){
                    count++;
                    list.clear();
                    list.add(line.charAt(i));
                }
                else if((prev+1)==count)
                    list.add(line.charAt(i));

            }
            else{
                // doesn't contain character

                    if(count<2)
                    list.add(line.charAt(i));

                    map.put(line.charAt(i),1);



            }

        }

        map.clear();

        Collections.sort(list);

        return list.get(0);

    }

    //working, not mine, AWESOME Solution
    public static char getMaxOccuringChar2(String str)
    {
        // Your code here
        int[] arr= new int[26];

        //create an array of count of characters
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //lowercase
            int number = 0;
            number = ch - 'a';
            arr[number]++;
        }

        //find maximum occ character
        int maxi = -1, ans = 0;
        for(int i=0;i<26; i++) {

            if(maxi < arr[i]) {
                ans = i;
                maxi = arr[i];
            }

        }

        int res = (int)'a' + ans;
        return (char)res;

    }

}
