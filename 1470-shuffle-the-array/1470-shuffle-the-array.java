class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(nums[i]);
        }
        int j=n;
        int k=1;
        while(j<2*n && k<2*n)
        {
            ans.add(k,nums[j]);
            j++;
            k +=2;
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}