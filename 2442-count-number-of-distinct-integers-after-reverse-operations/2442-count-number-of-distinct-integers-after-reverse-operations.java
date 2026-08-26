class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            int rev=0;
            while(nums[i]>0){
                int d=nums[i]%10;
                rev=rev*10+d;
                nums[i]=nums[i]/10;
            }
            ans.add(rev);
        }
        return ans.size();
     
    }
}