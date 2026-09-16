class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            int pd = 1;
            for(int j=i; j<nums.length; j++){
                pd *= nums[j];
                if(pd < k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;

    }
}