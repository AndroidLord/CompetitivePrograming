package Basic;

import java.util.ArrayList;

public class SumOfPrimes {

    public static void main(String[] args) {

       int res = primeSum(333);
        System.out.println(res);

    }

    static int primeSum(int n){

        ArrayList<Integer> list = new ArrayList<>();

        while(n!=0){

            int no = n%10;
            n = n/10;

            list.add(no);

        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==2 || list.get(i)==3 || list.get(i)==5) {
                sum += list.get(i);
                continue;
            }
            int lim = (int) Math.sqrt(list.get(i));
            for(int j=2;j<=lim;j++){

                if(list.get(i)%j==0)
                    break;

                if(j==lim)
                    sum+=list.get(i);
            }

        }
        return sum;
    }

}
