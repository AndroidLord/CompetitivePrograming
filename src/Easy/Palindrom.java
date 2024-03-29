package Easy;

public class Palindrom {

    public static void main(String[] args) {
        boolean result = isPalindrome(10);
        System.out.println(result);
    }

    // Method 1, using strings comparing them from first to last and so on
    public static boolean isPalindrome(int x) {


        if(x<0)
            return false;

        if(x<10)
            return true;

        int run=0;
        String len = Integer.toString(x);
        run = len.length();
        run = run/2;
        int i=0;
        while(run>0){

            if(len.charAt(i)!=len.charAt(len.length()-1-i))
                return false;

            run--;i++;
        }

        return true;
    }

    public static String is_palindrome(int n)
    {
        int size = String.valueOf(n).length();
        if(size==1)
            return "Yes";

        int i = 0 ;
        int j = size - 1 ;

        while(i<j){
            if(String.valueOf(n).charAt(i)!=String.valueOf(n).charAt(j))
                return "No";
            i++;j--;
        }
        return "Yes";

    }



}
