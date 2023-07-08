package Strings.Easy;

import java.util.HashMap;

public class MinimumChangesToMakeAllSubstringsDistinct {

    public static void main(String[] args) {

        int result = minChange("hnltkrnmjgghyalyen");

        System.out.println(result);

    }


    static int minChange(String S){


        int[] alph = new int[26];
        int sizeofString = S.length();
        int tcount = 0;
        for(int i=0;i<S.length();i++){

            int pos = S.charAt(i)-'a';

            alph[pos]++;

            tcount++;

        }

        int count = 0;
        for(int i=0;i<26;i++){

            if(alph[i]>1){
                count+=alph[i]-1;
            }

        }

        return count;
    }

    public int countWords(String list[], int n)
    {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<list.length;i++){

            map.put(list[i], map.getOrDefault( list[i],0) +1 );

        }

        int count = 0;
        for(int no: map.values() ){
            if(no==2) count++;
        }
        return count;
    }
}
