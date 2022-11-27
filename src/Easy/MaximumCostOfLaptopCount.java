package Easy;

import java.util.ArrayList;
import java.util.List;
// HackerRank
public class MaximumCostOfLaptopCount {
    // complete
    // Method 1, Using for loop and some condition
    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {

        ArrayList<Integer> list = new ArrayList<>();

        int cIndex = 0;
        int dCount = 0;
        int dCost = 0;
        for(String status:labels){

            if(status.equals("legal") && dCount<=dailyCount){
                dCount++;
                dCost +=cost.get(cIndex++);
            }
            else if(status.equals("illegal") && dCount<=dailyCount){
                dCost+=cost.get(cIndex++);
            }
            if(dCount==dailyCount){
                list.add(dCost);
                dCount = 0;
                dCost = 0;
            }

        }
        int max = 0;
        for(int num:list){
            if(num>max)
                max = num;
        }
        return max;
    }

}
