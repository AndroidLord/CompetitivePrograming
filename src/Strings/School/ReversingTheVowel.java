package Strings.School;

import java.util.ArrayList;

public class ReversingTheVowel {

    static String name = "geeksforgeeks";

    String modify(String s)
    {
        int size = s.length();
        char[] s1 = new char[size];
        s1 = s.toCharArray();

        ArrayList<Integer> indexNum = new ArrayList<>();
        ArrayList<Character> indexChar = new ArrayList<>();

        for(int i=0;i<size;i++){
            if(s1[i]=='a' ||
                    s1[i]=='e' ||
                    s1[i]=='i' ||
                    s1[i]=='o' ||
                    s1[i]=='u')
            {
                indexNum.add(i);
                indexChar.add(s1[i]);
            }
        }
        String str = "";
        int count = indexNum.size();
        int reverse = count -1;
        for(int j=0;j<count;j++){
            s1[indexNum.get(j)] = indexChar.get(reverse--);
        }

        return new String(s1);
    }



}
                            /*Explanation*/

//Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
//
//Example 1:
//
//Input:
//S = "geeksforgeeks"
//Output: geeksforgeeks
//Explanation: The vowels are: e, e, o, e, e
//Reverse of these is also e, e, o, e, e.
//
//Example 2:
//
//Input:
//S = "practice"
//Output: prectica
//Explanation: The vowels are a, i, e
//Reverse of these is e, i, a.
//
//
//Example 3:
//
//Input:
//S = "bcdfg"
//Output: bcdfg
//Explanation: There are no vowels in S.
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string by reversing only the vowels present in S.
//
//
//Expected Time Complexity: O(|S|).
//Expected Auxiliary Space: O(|S|).
//
//
//Constraints:
//1<=|S|<=105