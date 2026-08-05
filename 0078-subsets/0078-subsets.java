class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0, new ArrayList<Integer>(),ans);
        return ans;
    }

    private void solve(int[] nums, int i, List<Integer> curr,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(curr);
            return;
        }

        List<Integer> include=new ArrayList<>(curr);
        include.add(nums[i]);
        solve(nums, i+1, include,ans);

        solve(nums,i+1, curr,ans);

    }

}