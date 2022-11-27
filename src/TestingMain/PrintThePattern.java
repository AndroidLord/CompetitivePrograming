package TestingMain;

public class PrintThePattern {

    public static void main(String[] args) {
        printPat(4);
    }


    static void printPat(int n)
    {
        int times = n,i=0;
        int n1=n,j=0;
        while(times>0){

            System.out.print(n1+" ");

            if(n1==1 && i==n-1-j){
                times--;
                n1=n;
                j++;
                System.out.print("$");
                i=0;
                continue;
            }

            if(i==n-1-j){
                i=-1;
                n1--;
            }i++;

        }
    }

    static void printPat1(int n)
    {
        int count = n;
        int original = n;

        int i=0;
        while(n!=0){
            if(count>0){
                System.out.print(n+" ");

            }
            else if(count==0){
                n--;
                count= original+1;
            }
            if(n<=0){
                System.out.print("$");
                n=original-i;
                count=original+1;
                i++;
            }
            count--;
        }

    }

}
