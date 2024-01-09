package Easy;

public class N_FortunateNo {

    public static void main(String[] args) {

        long res = nthFortunateNum(3);
        System.out.println(res);

    }


    static long nthFortunateNum(int n) {


        int prod = 1;
        int no = 2,i=0;
        while(true)
        {
            if(isPrime(no)){

                prod = prod * no;
                i++;
            }

            if(i>=3)
                break;
            no++;

        }
        i=prod;

        while(true){

            if(isPrime(i++)){
                return i-1;
            }

        }

    }

    static boolean isPrime(int check) {

        if (check < 2)
            return false;

        if (check == 2 || check == 3 || check == 5)
            return true;

        for (int i = 2; i <= Math.sqrt(check); i++) {
            if (check % i == 0)
                return false;
        }

        return true;
    }



}
