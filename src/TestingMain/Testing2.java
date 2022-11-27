package TestingMain;

public class Testing2 {



    public static void main(String[] args) {

        String temp = "1234";

        int arr[] = new int[temp.length()];

        for(int i=0;i<temp.length();i++){
            arr[i]  = Character.getNumericValue(temp.charAt(i));

        }
        for(int num: arr){
            System.out.print(num+" ");
        }

//
//        int temp = s.indexOf(".");
//        System.out.println(temp);

//        if(s.contains(".")){
//            System.out.println(s);
//        }

    }

}
