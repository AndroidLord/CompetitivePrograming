package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArraySums {

    public static void main(String[] args) {
        int[] num = {-5,0};
        int[] que1 = {2,2,20};
        int[] que2 = {1,2,10};
        List<Integer> numbers = new ArrayList<>();
        List<Integer> query = new ArrayList<>();
        List<Integer> query2 = new ArrayList<>();
        List<List<Integer>> queries = new ArrayList<>();
        for (int res:num){
            numbers.add(res);
        }
        for(int res: que1){
            query.add(res);
        }
        for(int res: que2){
            query2.add(res);
        }
        queries.add(query);
        queries.add(query2);

        List<Long> list = findSum(numbers,queries);
        for (long res:list){
            System.out.println(res);
        }
    }

    public static List<Long>
    findSum(List<Integer> numbers, List<List<Integer>> queries) {

        List<Long> list = new ArrayList<>();



        for(List<Integer> query:queries){
            int i = query.get(0)-1;
            int l = query.get(1)-1;
            long sum = 0;

            for(int k=i;k<=l;k++){
                int num = numbers.get(k);
                if(num==0)
                    sum+=query.get(2);
                else
                    sum +=(long)num;
                }
            list.add(sum);
        }

        return list;
    }

}
