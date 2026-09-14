class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
    
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            // left half sorted hai
            if(nums[left] <= nums[mid]){
                // target left sorted half me hai
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }
                // target right sorted half me hai
                else{
                    left = mid + 1;
                }
            }
            // right half sorted hai
            else {
                // target right sorted half me hai
                if(nums[mid] < target && target <= nums[right] ){
                    left = mid + 1;
                }
                // target left sorted half me hai
                else{
                    right = right - 1;
                }
            }
        } 
        return -1;
    }
}