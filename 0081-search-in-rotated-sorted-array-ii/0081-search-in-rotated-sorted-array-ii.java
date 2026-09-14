class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]){
                return true;
            }
            
            // Duplicate case
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }

            else if(nums[left] <= nums[mid]) //iska mtlb left half sorted hai
            {
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else //right half sorted hai
            {
                if(nums[right] >= target && target > nums[mid]){
                    left = mid +1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}