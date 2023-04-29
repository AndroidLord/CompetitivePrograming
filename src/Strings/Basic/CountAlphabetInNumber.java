package Strings.Basic;

import java.sql.SQLOutput;
import java.util.HashMap;

public class CountAlphabetInNumber {



    public static void main(String[] args) {

        String s = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";


        countAlphabetInNumber(s);
    }


    static void countAlphabetInNumber(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i< s.length();i++){

            if(map.containsKey(s.charAt(i))){
                // contains

                int prev = map.get(s.charAt(i));
                map.put(s.charAt(i),prev+1);

            }
            else{
                // doesn't contain character

                    map.put(s.charAt(i),1);
                }

            }

        System.out.println("Total Character are: " +s.length() );
        System.out.println("Length of the Character is: \n" );

        for(char ch: map.keySet()){

            System.out.println(ch + ": " + map.get(ch));

        }

    }

}



