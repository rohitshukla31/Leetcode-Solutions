class Solution {
    public int maxSubArray(int[] nums) {
        // //==============brute force=============
        // // it will give time limit exceed...........
        // int maxSum = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        // return maxSum;

        //========kadane's Algorithm==========
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}