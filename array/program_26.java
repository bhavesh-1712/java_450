package array;

/**
 * Maximum profit by buying and selling a share at most twice
 */
public class program_26 {

    static int maxProfit(int prices[], int n){
        int profit[] = new int[n];
        for(int i = 0; i < n; i++)
            profit[i] = 0;
        
        int max_price = prices[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(prices[i] > max_price)
                max_price = prices[i];

            profit[i] = Math.max(profit[i + 1], max_price - prices[i]);
        }

        int min_price = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] < min_price)
                min_price = prices[i];

            profit[i] = Math.max(profit[i - 1], profit[i] + (prices[i] - min_price));
        }

        return profit[n - 1];
    }

    public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = price.length;
        System.out.println("Maximum Profit = "+ maxProfit(price, n));
    }
}