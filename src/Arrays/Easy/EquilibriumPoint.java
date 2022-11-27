package Arrays.Easy;

public class EquilibriumPoint {

    public static void main(String[] args) {
        int n = 5;
        long A[] = {1,3,5,2,2} ;

        int result = equilibriumPoint(A, n);
        System.out.println(result);


    }
    // Used In Method1,Method2
    static int sumArray(long[] array,int initial,int last){
        int sum = 0;
        if(initial==last)
        {
            sum =  (int)array[initial];
            return sum;

        }

        for(int i=initial;i<=last;i++){
            sum+=array[i];
        }
        return sum;
    }

    // Method1(Logic is correct, but It exceeds the time complexity of O(n))
    public static int equilibriumPoint(long arr[], int n) {

        if(n==1)
            return 1;

        for(int i=0;i<n-2;i++){
            int firstPart = sumArray(arr,0,i);
            int secondPart = sumArray(arr,i+2,n-1);

            if(firstPart==secondPart)
                return i+2;
        }
        return -1;
    }

    // Method 2
    public static int equilibriumPoint2(long arr[], int n) {

        if(n==1)
            return 1;

        int totalSum = sumArray(arr,0,n-1);

        for(int i=1;i<n-1;i++){
            int even = (int)(totalSum-arr[i]);
            if(even%2==0){
                int oneSide = sumArray(arr,0,i-1);
                int half = even/2;
                if(oneSide==half)
                    return i+1;
            }
        }
        return -1;
    }

    //Method 3, mine done using pointer approach
    public static int equilibriumPoint3(long arr[], int n) {

        int front = 0,fsum=(int)arr[front];
        int back = n-1,bsum=(int)arr[back];

        if(n==1){
            return 1;
        }
        while(back!=front+1){
            if(fsum==bsum){
                if(front+1==back-1)
                    return front+2;

                if(arr[front+1]<arr[back-1])
                {
                    front++;
                    fsum +=(int)arr[front];
                }
                else{
                    back--;
                    bsum +=(int)arr[back];
                }

            }
            else if(bsum>fsum){
                front++;
                fsum +=(int)arr[front];
            }
            else
            {
                back--;
                bsum +=(int)arr[back];
            }
        }
        return -1;

    }

    //Method 4, not mine but very new and good thinking
    public static int equilibriumPoint4(long arr[], int n) {

        if(n == 1)

        {

            return 1;

        }

        long a[] = new long[n];

        int sum = 0;

        for(int i=0;i<n;i++)

        {

            sum += arr[i];

            a[i] = sum;

        }

        for(int i=1;i<n-1;i++)

        {

            if(a[i-1] == (a[n-1]-a[i]))

            {

                return i+1;

            }

        }

        return -1;

    }
}
