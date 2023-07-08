package TestingMain;

public class Testing2 {



    public static void main(String[] args) {

//        String temp = "1234";
//
//        int arr[] = new int[temp.length()];
//
//        for(int i=0;i<temp.length();i++){
//            arr[i]  = Character.getNumericValue(temp.charAt(i));
//
//        }
//        for(int num: arr){
//            System.out.print(num+" ");
//        }

//
//        int temp = s.indexOf(".");
//        System.out.println(temp);

//        if(s.contains(".")){
//            System.out.println(s);
//        }


        int[] salary = {4000,3000,1000,2000};
        double avg = average(salary);
        System.out.println(avg);

    }

    public static double average(int[] salary) {

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){

            int cur = salary[i];
            if(min>cur){
                min = cur;
            }
            if(cur>max){
                max = cur;
            }

        }

        int sum=0;
        for(int i=0;i<salary.length;i++){
            int cur =  salary[i];
            if(cur!=min && cur!=max){
                sum += cur;
            }
        }
        return sum/(salary.length-2);
    }


}
