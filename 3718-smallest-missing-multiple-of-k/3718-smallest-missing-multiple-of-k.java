class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;
        Arrays.sort(nums);
        for(int num:nums){
            if(num==multiple){
                multiple=multiple+k;
            }
        }     
        return multiple;
    }
}