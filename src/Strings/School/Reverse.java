package Strings.School;

public class Reverse {

    static String name = "Geeks";



    // Method 1
    String revStr(String S) {
         int n = S.length();
         int a=0;

         char[] temp = new char[n];

         for(int i=n-1;i>=0;i--){
             temp[a++] = S.charAt(i);
         }
         return new String(temp);
    }

    // Method 2
    String revStr2(String S){

         String reverse = "";

         for(int i = S.length()-1;i>=0;i--)
         {
             reverse+=S.charAt(i);
         }
         return reverse;
    }

}
