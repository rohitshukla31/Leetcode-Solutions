
class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] present=new boolean[upper+1];
        for(int num : nums){
            if(num >= lower && num <= upper){
                present[num]=true;
            }
        }
        int start=-1;
        for(int i = lower ; i <= upper ; i++){
            if(!present[i]){
                if(start == -1){
                    start = i;
                }
            }
            else{
                if( start != -1){
                    ans.add(Arrays.asList(start, i-1));
                    start = -1;
                }
            }
        }
        if(start != -1){
            ans.add(Arrays.asList(start, upper));
        }
        return ans;
    }
}