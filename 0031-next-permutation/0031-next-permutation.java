class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1])
            {
                pivot = i;
                break;
                
            }
        }
        if(pivot==-1){
            int left=0;
            int right=nums.length-1;
            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }
        if(pivot > -1){
            for(int i=nums.length-1; i>pivot; i--){
                if(nums[i] > nums[pivot]){
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }
        int s=pivot + 1;
        int e=nums.length-1;
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        return ;

    }
}