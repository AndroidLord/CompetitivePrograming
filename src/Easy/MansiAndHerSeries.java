package Easy;

public class MansiAndHerSeries {

    public static void main(String[] args) {


        int res = nthTerm(5);
        System.out.println(res);

    }


    static int nthTerm(int n){

        int count = 0;
        int sum = 3;

        if(n==0)
            return 0;

        for(int i=0;i<n;i++){

            if(count<2){
                // add 2

                count++;

                if(i!=0){
                    sum = sum + sum + 2;
                }

            }
            else if(count>=2){
                // remove 2

                sum = sum + sum - 4;


                if(count==3)
                {
                    count = -1;
                }

                count++;


            }

        }
        return sum;

    }


}
