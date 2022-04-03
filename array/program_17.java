package array;

/**
 * Best time to buy sell stock
 */
public class program_17 {

    static int findMaximumProfit(int[] prices, int i, int k, int buy, int[][] v){

        // If no stock can be chosen
        if(i >= prices.length || k <= 0)
            return 0;

        if(v[i][buy] != -1)
            return v[i][buy];
        
        int nBuy;
        if(buy == 1)
            nBuy = 0;
        else
            nBuy = 1;
        
        if(buy == 1){
            return v[i][buy] = Math.max(-prices[i] + findMaximumProfit(prices, i+1, k, nBuy, v), findMaximumProfit(prices, i+1, k, (int)buy, v));
        }else{
            if(buy == 1)
                nBuy = 0;
            else
                nBuy = 1;
            
            return v[i][buy] = Math.max(prices[i] + findMaximumProfit(prices, i+1, k-1, nBuy, v), findMaximumProfit(prices, i+1, k, buy, v));
        }
    }

    static int maxProfit(int[] prices){
        int n = prices.length;
        int[][] v = new int[n][2];

        for(int i = 0; i < v.length; i++){
            v[i][0] = -1;
            v[i][1] = -1;
        }

        return findMaximumProfit(prices, 0, 1, 1, v);
    }

    public static void main(String[] args){
        
        // int[] prices = {7, 1, 5, 3, 6, 4};

        int[] prices = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices));
    }
}

/**
 * OUTPUT 
 * 
 * 5 
 * 
 * ========================
 * 
 * 0
 * 
 */