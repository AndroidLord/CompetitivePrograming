package Arrays.Easy;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {
    // completed by self, but could be better
    public static void main(String[] args) {



        long a1[] = {589, 5847, 595, 959, 258};
        long a2[] = {258, 25};

        String result = isSubset(a1,a2, a1.length, a2.length);
        System.out.println(result);

    }

    public static String isSubset( long a1[], long a2[],
                            long n, long m) {



        if(n>=m){

            HashMap<Long,Integer> list1 = new HashMap<>();
            HashMap<Long,Integer> list2 = new HashMap<>();
            // making a1 into HashMap
            for(int i=0;i<n;i++){

                    list1.put(a1[i],1);

            }
            // making a2 into HashMap
            for(int i=0;i<m;i++){
                if(list2.containsKey(a2[i]))
                {
                    list2.put(a2[i], list2.get(a2[i])+1);
                }
                else
                    list2.put(a2[i],1);
            }

            // now checking if the element is in the First HashMap and then individually check for the
            // count of that key, if key is less than the main Arrays. Then it is a subset!!
            for(int i=0;i<m;i++){
                if(list1.containsKey(a2[i])){

                    int value1 = list1.get(a2[i]);
                    int value2 = list2.get(a2[i]);
                    if(value2>value1)
                        return "No";
                }
                else
                    return "No";
            }
        }
        else
            return "No";
        return "Yes";
    }



}
