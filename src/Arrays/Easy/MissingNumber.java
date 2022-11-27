package Arrays.Easy;

public class MissingNumber {


    static int[] num = {1,2,3,4,5,6,7,8,10};

    int MissingNumber(int array[], int n) {

        int length_Array = n-1;
        int length=0;

        if(n-1==1)
            return array[0];

        for(int i=1;i<=n;i++){
            if(array[length]!=i && length<length_Array)
                return i;
            length++;
        }


        return -1;
    }

}
