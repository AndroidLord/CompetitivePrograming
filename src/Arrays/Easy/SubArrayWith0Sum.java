package Arrays.Easy;

public class SubArrayWith0Sum {

    public static void main(String[] args) {

        int size = 5;
        int[] arr4 = { 10,-10};

        boolean result = findsum(arr4,arr4.length);

        System.out.println(result);

    }

    static boolean findsum(int arr[],int n)
    {
        int curr = arr[0];
        for(int i=1;i<n;i++){

            if(curr == 0)
                return true;

            if(curr>arr[i] && arr[i]>0)
            {
                curr = arr[i];
                continue;
            }

            if(arr[i]<0 || curr<0){
                curr = curr + arr[i];
            }


        }

        if(curr == 0)
            return true;
        return false;
    }

}
