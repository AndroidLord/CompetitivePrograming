package Arrays.Basic;

import java.util.Arrays;

public class FascinatingNo {

    static boolean fascinating(long n) {


        String s1 = String.valueOf(n)+""+String.valueOf(n*2)+""+String.valueOf(n*3);
        if(s1.length()!=9)
            return false;
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);
        s1 = new String(ch);

        String s2 = "123456789";
        if(s1.equals(s2))
            return true;
        else
            return false;



    }

    // Method 2, My method
    static boolean fascinating2(long n) {

        String original = Long.toString(n);
        long sec = n*2;
        String second = Long.toString(sec);
        long thi = n*3;
        String third = Long.toString(thi);

        original = original + second + third;
        char[] ch = original.toCharArray();
        Arrays.sort(ch);

        for(int i=1;i<10;i++){
            if(Integer.parseInt(String.valueOf(ch[i-1]))!=i)
                return false;
        }


        return true;
    }

    public static void main(String[] args) {
        long n = 192;
        boolean result = fascinating2(n);
        System.out.println(result);
    }
}
