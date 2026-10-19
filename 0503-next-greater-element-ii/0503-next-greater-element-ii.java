class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        
        for(int i=2*nums.length -1 ; i>=0 ; i--){
            int idx = i%n;

            while(!st.isEmpty() && st.peek() <= nums[idx]){
                st.pop();
            }
            if(!st.isEmpty() && i<nums.length) {
                arr[i] = st.peek();
            }
            
            st.push(nums[idx]);
        }
        return arr;
    }
}