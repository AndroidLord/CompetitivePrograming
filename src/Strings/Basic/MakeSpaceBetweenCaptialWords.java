package Strings.Basic;

import java.util.Scanner;

public class MakeSpaceBetweenCaptialWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**Make Space Between Captial Words**");
        System.out.println("Please Enter the Text");
        String S = scan.nextLine();

        System.out.println("[ Input Inserted ]");

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

        System.out.println("[ Output ]");
        System.out.println(" ");
        String result = firstAlphabet(S);
        System.out.println(result);
    }

    static String firstAlphabet(String S) {

        String str = "";

        for(int i=0;i<S.length();i++){

            if(S.charAt(i)>='A' && S.charAt(i)<='Z' && i!=0){
                str += " ";
                str +=S.charAt(i);
            }
            else{
                str += String.valueOf(S.charAt(i));
            }


        }

        return str;

    }

}
