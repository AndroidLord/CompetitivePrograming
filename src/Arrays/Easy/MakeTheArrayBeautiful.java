package Arrays.Easy;

import java.util.ArrayList;

public class MakeTheArrayBeautiful {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, -1};
        ArrayList<Integer> list = makeBeautiful(arr);

        System.out.println(list.toString());

    }


    public static ArrayList<Integer> makeBeautiful(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();


        for(int i=0;i<arr.length-1;i++){

            int no1 = arr[i];
            int no2 = arr[i+1];

            if(no2<0){
                int[] arr2 = new int[arr.length-2];
                int a = 0;

                for(int j=0;j<arr2.length; j++){

                    if(a==i)
                        a+=2;

                    if(a!=i || (a+1)!=(i+1)){
                        arr2[j] = arr[a++];
                    }
                    if(a==i)
                        a+=2;

                }
                arr = arr2;
            }
            else{
                list.add(no1);
            }
        }
        if(arr[arr.length-1]>=0 || arr.length==1)
            list.add(arr[arr.length-1]);

        return list;
    }

}
