package Arrays.Easy;
//question from gfg
public class LeftMostAndRightMostIndex {
// complete
    static class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        int N = 9;
        long v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x  = 5;
        pair result = indexes(v,x);

        System.out.print(result.first +" " + result.second);
    }

    // Method 1, good but could be better
    public static pair indexes(long v[], long x)
    {
        long first=0,second=0;

        for(int i=0;i<v.length;i++){
            if(v[i]==x){
                first = i;
                second = i;

                while(i<v.length)
                {
                    if(v[i]==x)
                        second = i;

                    if((i+1)<v.length)
                        if(v[i+1]!=x)
                            break;

                    i++;
                }
                return new pair(first,second);
            }
        }

        return new pair(-1,-1);
    }

}
