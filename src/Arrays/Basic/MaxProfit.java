package Arrays.Basic;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {1,4,2};

        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = 0;

        int profit = 0;

        if(prices.length==1)
            return 0;



        for(int i=0;i<prices.length-1;i++){

            if(prices[i]>prices[i+1]) {
                buy = prices[i + 1];i++;
            }

            int j=i,k=prices.length-1;
            while(j<k){

                int tp = 0;

                sell = prices[j];
                if(sell>buy)
                    tp = sell - buy;

                sell = prices[k];
                if(tp<(sell-buy) && sell>buy)
                    tp = sell - buy;

                j++;k--;

                if(tp>profit)
                    profit=tp;

            }



        }
        return profit;
    }

}
