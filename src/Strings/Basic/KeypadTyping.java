package Strings.Basic;

public class KeypadTyping {

    public static void main(String[] args) {
        String S = "geeksforgeeks";

        String res = printNumber3(S,S.length());
        System.out.println(res);
    }


    // working, mine
    public static String printNumber(String s, int n)
    {
        String str = "";
        for(int i=0;i<n;i++){

            if(s.charAt(i)=='a' ||
                    s.charAt(i)=='b' ||
                    s.charAt(i)=='c' ){
                str +="2";
            }

            if(s.charAt(i)=='d' ||
                    s.charAt(i)=='e' ||
                    s.charAt(i)=='f' ){
                str +="3";
            }

            if(s.charAt(i)=='g' ||
                    s.charAt(i)=='h' ||
                    s.charAt(i)=='i' ){
                str +="4";
            }


            if(s.charAt(i)=='j' ||
                    s.charAt(i)=='k' ||
                    s.charAt(i)=='l' ){
                str +="5";
            }

            if(s.charAt(i)=='m' ||
                    s.charAt(i)=='n' ||
                    s.charAt(i)=='o' ){
                str +="6";
            }

            if(s.charAt(i)=='p' ||
                    s.charAt(i)=='q' ||
                    s.charAt(i)=='r' ||
                    s.charAt(i)=='s' ){
                str +="7";
            }

            if(s.charAt(i)=='t' ||
                    s.charAt(i)=='u' ||
                    s.charAt(i)=='v' ){
                str +="8";
            }


            if(s.charAt(i)=='w' ||
                    s.charAt(i)=='x' ||
                    s.charAt(i)=='y' ||
                    s.charAt(i)=='z' ){
                str +="9";
            }
        }
        return str;

    }


    // not mine, but another good approach
    public static String printNumber2(String s, int n)
    {
        String num="22233344455566677778889999";
        String alpha="abcdefghijklmnopqrstuvwxyz";

        String str="";
        for(int i=0;i<n;i++){

            char ch=s.charAt(i);
            int nn=alpha.indexOf(ch);
            str+=num.charAt(nn);

        }
        return str;

    }

    // not mine, but most awsome one
    public static String printNumber3(String s, int n)
    {
        //code here
        String num = "22233344455566677778889999";

        String ans = "";

        for(int i=0; i<n; i++){
            ans = ans + num.charAt(s.charAt(i) - 'a');
        }

        return ans;
    }

    // not mine, but most awsome one
    public static String printNumber4(String s, int n)
    {

        String str="";
        for(int i=0;i<n;i++){

            char c=s.charAt(i);

            String ch=""+c;
            if("abc".contains(ch)) str+='2';
            if("def".contains(ch)) str+='3';
            if("ghi".contains(ch)) str+='4';
            if("jkl".contains(ch)) str+='5';
            if("mno".contains(ch)) str+='6';
            if("pqrs".contains(ch)) str+='7';
            if("tuv".contains(ch)) str+='8';
            if("wxyz".contains(ch)) str+='9';
        }
        return str;

    }
}
