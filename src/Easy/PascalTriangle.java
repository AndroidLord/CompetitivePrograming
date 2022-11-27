package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();

        result = generate(5);

        for(List<Integer> list:result){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<numRows;i++){

            List<Integer> ilist = new ArrayList<>();

            for(int j=0;j<i+1;j++){
                ilist.add(1);
            }

            list.add(ilist);
        }

        if(numRows>2){

                for(List<Integer> num: list){
                    int j=num.size();

                    if(j>2)
                    for(int k=1;k<j-1;k++){

                        List<Integer> temp = list.get(j-2);
                        int num1 = temp.get(k-1);
                        int num2 = temp.get(k);
                        int res = num1+num2;

                        num.set(k,res);

                    }
                }
            }


        return list;
    }

}
