class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n=nums.length;
        // int count=0;
        
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {     
        //         sum=sum+nums[j];
        //         if(sum==k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        int count=0;
        int preSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            preSum +=nums[i];
            int remove=preSum-k;
            count +=map.getOrDefault(remove, 0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
        
    }
}