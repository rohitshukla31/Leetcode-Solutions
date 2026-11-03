class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for(int i=0; i<nums.length-1; i++){
            while(nums[i] < nums[nums.length-1]){
                nums[i]++;
                moves++;
            }
        }
        return moves;
    }
}