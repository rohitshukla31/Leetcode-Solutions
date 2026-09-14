class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int left = 0;
        int right = nums.length - 1;

        // first occurrence ke liye hai 
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                start = mid;
                right = mid -1;
            }
        }

        // last occurrence ke liye hai
        left = 0;
        right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target > nums[mid]){
                left = mid + 1;
            }

            else if(target < nums[mid]){
                right = mid-1;
            }
            else{
                end = mid;
                left = mid+1;
            }
        }
        return new int[] {start, end};
    }
}