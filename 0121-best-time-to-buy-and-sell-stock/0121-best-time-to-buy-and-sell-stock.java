class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        int maxProfit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else
            {
                buyprice=prices[i];
            }
        }
        
        return maxProfit;
        
    }
}