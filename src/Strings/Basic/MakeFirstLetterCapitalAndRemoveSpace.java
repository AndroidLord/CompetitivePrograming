package Strings.Basic;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MakeFirstLetterCapitalAndRemoveSpace {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**Making First Letter Capital And Remove Space**");
        System.out.println("Please Enter the Text");
        String S = scan.nextLine();

        System.out.println("Input Inserted...");

        try {
            Thread.sleep(1000);
            System.out.print("Processing");

            Thread.sleep(400);
            System.out.print(".");

            Thread.sleep(400);
            System.out.print(".");

            Thread.sleep(400);
            System.out.print(".");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Done, Printing the Desired Output..");

        String result = firstAlphabet(S);
        System.out.println(result);

    }

    static String firstAlphabet(String S) {

        String str = "";

        for(int i=0;i<S.length();i++){

            if(i==0) {
                str = String.valueOf(S.charAt(i)).toUpperCase();
                continue;
            }

            if(S.charAt(i)==' '){
                str += String.valueOf(S.charAt(++i)).toUpperCase();
            }
            else{
                str += String.valueOf(S.charAt(i));
            }


        }

        return str;

    }

}
