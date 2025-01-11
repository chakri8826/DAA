public class S1BASS1 {
    public static int maxProfit(int[] prices) {
        int mini=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-mini;
            profit = Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}


