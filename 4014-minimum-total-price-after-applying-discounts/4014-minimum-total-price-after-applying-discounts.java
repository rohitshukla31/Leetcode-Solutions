class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        int m=discounts.length-1;
        int n=prices.length-1;
        while(m>=0 && n>=0)
        {
            sum=sum+((double)prices[n]*(100-discounts[m]))/100;
            n--;
            m--;
        }
        while(n>=0)
        {
            sum=sum+prices[n];
            n--;
        }
        return sum;
    }
}