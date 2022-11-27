package Arrays.Basic;

import java.util.HashMap;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int result = maxProfit1(arr);
        System.out.println(result);
    }

    // this is wrong
    public static int maxProfit(int[] prices) {

        int days = prices.length;

        int buy=prices[days-1],sell=prices[0];
        int i=days-2,j=1;
        while(i>=0 && j<days){
            // this is sell prices
            if(sell<prices[j]){
                sell = prices[j];
            }
            if(buy>prices[i]){
                buy = prices[i];
            }
            i--;j++;
        }

        return buy-sell;
    }

    // this is also wrong
    public static int maxProfit1(int[] prices) {

        int result = 0;
        int days = prices.length;

        for(int i=0;i<days-1;i++){
            // currentPrice == buy
            int currentPrice = prices[i];
            for(int j=i+1;j<days;j++){

                int res = prices[j]-currentPrice;

                if(currentPrice<prices[j] && res>0){
                    if(res>result)
                        result = res;
                }

            }
        }
        return result;

    }

    // this is also wrong
    public static int maxProfit2(int[] prices) {

        int result = 0;
        int days = prices.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int high = 0;
        for(int i=days-1;i>=0;i--){
            if(high<prices[i]){
                high = prices[i];
                map.put(prices[i],1);
            }
        }

        for(int i=0;i<days-1;i++){
            // currentPrice == buy
            int currentPrice = prices[i];
            if(!map.containsKey(currentPrice)){
                for(int j=i+1;j<days;j++){

                    int res =  prices[j]-currentPrice;

                    if(currentPrice<prices[j] && res>0){
                        if(res>result)
                            result = res;
                    }

                }
            }
        }
        return result;

    }



}
