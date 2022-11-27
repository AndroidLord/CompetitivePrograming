package HardQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDirectory {

    public static void main(String[] args) {
        int n = 14;
        String[] contact ={"sanabaaaaababa",
                "sanababaaaaaaaa ",
                "sanaababba ",
                "sanbbbbbaa ",
                "sanabbbbaab ",
                "sanaab ",
                "sanaba ",
                "sanaab ",
                "sanaaabbabb",
                "sanabb ",
                "sanaababbabaa",
                "sanbabb ",
                "sanbabbbaabbbb",
                "sanaaaaabbb"};
        String search = "sanbbb";

        ArrayList<ArrayList<String>> arraylist = displayContacts(n,contact,search);
        for(ArrayList list:arraylist)
            System.out.println(list);


    }

    static ArrayList<ArrayList<String>> displayContacts2(int n,String[] contact, String s)
    {
        ArrayList<ArrayList<String>> arraylist = new ArrayList<>();
        int size = s.length();

        for(int i=0;i<size;i++){

            String subString = s.substring(0,i+1);
            ArrayList<String> list = new ArrayList<>();

            for(int j=0;j<n;j++)
            {   String temp = null;

                if(contact[j].length()>=i)
                temp = contact[j].substring(0,i+1);

                if(subString.equals(temp))
                    list.add(contact[j]);
            }

            if(list.isEmpty())
               list.add("0");

            arraylist.add(list);
        }

        return arraylist;
    }

    static ArrayList<ArrayList<String>> displayContacts(int n,
                                                        String contact[], String s)
    {
        ArrayList<ArrayList<String>> arraylist = new ArrayList<>();
        int size = s.length();

        for(int i=0;i<size;i++){

            String subString = s.substring(0,i+1);
            ArrayList<String> list = new ArrayList<>();

            for(int j=0;j<n;j++)
            {   String temp = null;

                if(contact[j].length()>i)
                    temp = contact[j].substring(0,i+1);

                if(subString.equals(temp))
                    list.add(contact[j]);
            }

            if(!list.isEmpty()) {

                ArrayList<String> newl = list.stream()
                        .distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

                arraylist.add(newl);
            }
            else
            {
                list.add("0");
                arraylist.add(list);}
        }
        return arraylist;
    }


}
