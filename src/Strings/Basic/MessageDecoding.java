package Strings.Basic;

import java.sql.SQLOutput;

public class MessageDecoding {

    public static void main(String[] args) {

       // System.out.println("a".);

    }

    // Mine, Working
    public boolean decode(String S)
    {
        String check = "hello";

        int count = 0,index=0;

        for(int i=0;i<S.length();i++){

            char ch = S.charAt(i);

            if(count==0 && ch=='h') {count++;continue;}
            if(count==1 && ch=='e') {count++;continue;}
            if(count==2 && ch=='l') {count++;continue;}
            if(count==3 && ch=='l') {count++;continue;}
            if(count==4 && ch=='o') {count++;continue;}

        }

        if(count==5)
            return true;

        return false;
    }

    // Mine, same as first but smart implementation of logic into code
    public boolean decode2(String S)
    {
        String check = "hello";

        int count = 0,index=0;
        int j=0;
        for(int i=0;i<S.length();i++){

            char ch = S.charAt(i);

            if(ch==check.charAt(j))
                j++;
            if(j==check.length())
                return true;
        }


        return false;
    }

    // Not Mine, awesome Solution
    public boolean decode3(String S)
    {
        //code here
        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        int counter = 0;
        int index = S.indexOf(arr[counter++]);
        if(index == -1){
            return false;
        }
        int oldindex = index;
        while(oldindex != -1){
            index = S.indexOf(arr[counter++], oldindex + 1);
            if(index == -1){
                return false;
            }
            oldindex = index;
            if(counter == arr.length){
                return true;
            }
        }
        return true;
    }

}
