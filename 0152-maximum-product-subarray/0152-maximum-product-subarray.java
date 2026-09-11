class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxPd=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            int pd=1;
            for(int j=i;j<n;j++)
            {  
                pd=pd*nums[j];   
                maxPd=Math.max(maxPd,pd);
            }
        }
        return maxPd;
        
    }
}