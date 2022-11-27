package Strings.School;

import java.util.ArrayList;

public class RemovingSpace {

    static String S = "Geeks  for Geeks";

    String modify(String S)
    {
        int index = 0;
        String S2 = " ";
        ArrayList<String> temp = new ArrayList<>();

        for(int i=0;i<S.length();i++){

            index = S.indexOf(" ");

            String S1 = String.valueOf(S.charAt(i));

            if(S1.compareTo(S2)!=0)
            {
                temp.add(S.substring(i,index));
                S = S.substring(index,S.length());
            }

            i = index;
        }
        String result=null;
        for(int j=0;j<temp.size()-1;j++){
            result = result + temp.get(j);
        }
        return result;

    }


    String modify2(String S)

    {

        String newstr="";

        for(int i=0;i<S.length();i++){

            if(S.charAt(i)!=' '){

                newstr+=S.charAt(i);

            }

        }

        return newstr;

    }

}

