package Strings.Easy;

import java.util.ArrayList;

public class ReverseWordGivenInAString {

    static String word = "i.like.this.program.very.much";

    String reverseWords(String s)
    {
        ArrayList<String> str = new ArrayList<>();

        int first=0;
        int last= s.indexOf(".");
        if(last==-1){
            return s;
        }
        String temp ="";

        while(first<s.length()){
            if(first<last)
            {
                temp += s.charAt(first);
                first++;

                if(first==last)
                {
                    str.add(temp);
                    if(first!=s.length())
                        str.add(".");
                }
            }
            else
            {


                s = s.substring(first+1,s.length());
                first=0;
                last = s.indexOf(".");

                if(!s.contains(".")){
                    last = s.length();
                }
                temp="";
            }
        }
        temp="";
        for(int j=str.size()-1;j>=0;j--){
            temp+=str.get(j);
        }



        return temp;
    }

}

//    Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
//
//        Example 1:
//
//        Input:
//        S = i.like.this.program.very.much
//        Output: much.very.program.this.like.i
//        Explanation: After reversing the whole
//        string(not individual words), the input
//        string becomes
//        much.very.program.this.like.i
//        Example 2:
//
//        Input:
//        S = pqr.mno
//        Output: mno.pqr
//        Explanation: After reversing the whole
//        string , the input string becomes
//        mno.pqr
//
//        Your Task:
//        You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.'
//
//
//        Expected Time Complexity: O(|S|)
//        Expected Auxiliary Space: O(|S|)
//
//
//        Constraints:
//        1 <= |S| <= 105
