class Solution {
    public int missingMultiple(int[] nums, int k) {
    //     int multiple=k;
    //     Arrays.sort(nums);
    //     for(int num:nums){
    //         if(num==multiple){
    //             multiple=multiple+k;
    //         }
    //     }     
    //     return multiple;
    

    //==============Hash Map===============
        
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int multiple=k;
        while(set.contains(multiple)){
            multiple += k;
        }

        return multiple;
    }
}