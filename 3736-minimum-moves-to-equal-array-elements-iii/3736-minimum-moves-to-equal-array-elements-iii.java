class Solution {
    public int minMoves(int[] nums) {
        //==========optimal solution===========
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(nums[i], max);

        }

        return max*nums.length - sum;


        //============brute force============
        // Arrays.sort(nums);
        // int moves = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     while(nums[i] < nums[nums.length-1]){
        //         nums[i]++;
        //         moves++;
        //     }
        // }
        // return moves;
    }
}