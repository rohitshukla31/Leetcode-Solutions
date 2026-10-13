class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[i] = -1* nums[i];
            }
        }
        Arrays.sort(nums);
        long sum1 = 0;
        long sum2 = 0;
        int n = nums.length;

        int mid = n/2;
        if(n%2 != 0){
            mid = mid-1;
            for(int i=0; i <= mid; i++){
                sum1 -= nums[i]*nums[i];
            }
            for(int i=mid+1; i<n; i++){
                sum2 += nums[i]*nums[i];
            }
        }
        else{
            for(int i=0; i < mid; i++){
                sum1 -= nums[i]*nums[i];
            }
            for(int i=mid; i<n; i++){
                sum2 += nums[i]*nums[i];
            }
        }

        

        return sum1+sum2;
    }
}