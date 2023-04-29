package Strings.Basic;

public class RockPaperScissor {


    // Working, mine
    String gameResult(String s)
    {
        String str = "";

        for(int i=0;i<s.length();i+=2){

            if(s.charAt(i)=='R'){
                // Rock P-A

                if(s.charAt(i+1)=='S'){
                    str +="A";
                }
                else if(s.charAt(i+1)=='P')
                {
                    str +="B";
                }
                else
                    str +="DRAW";

            }
            else if(s.charAt(i)=='S'){
                // Scissor P-A


                if(s.charAt(i+1)=='P'){
                    str +="A";
                }
                else if(s.charAt(i+1)=='R')
                {
                    str +="B";
                }
                else
                    str +="DRAW";

            }
            else{
                // Paper P-A


                if(s.charAt(i+1)=='R'){
                    str +="A";
                }
                else if(s.charAt(i+1)=='S')
                {
                    str +="B";
                }
                else
                    str +="DRAW";

            }

        }return str;
    }

    // not mine, awesome solution
    String gameResult2(String s)
    {
        char a = s.charAt(0);
        char b = s.charAt(1);

        if((a=='R' && b=='S') || (a=='S' && b=='P') || (a=='P' && b == 'R'))
            return "A";
        else if(a==b)
            return "DRAW";
        else
            return "B";
    }
}
