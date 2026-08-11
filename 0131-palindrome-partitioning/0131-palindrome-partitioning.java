class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> arr=new ArrayList<>();
        helper(s,ans,arr,0);
        return ans;
    }

    private void helper(String s,List<List<String>> ans, List<String> arr, int start)
    {
        // base case
        if(start==s.length())
        {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int end=start; end<s.length(); end++)
        {
            if(is_palindrome(s,start,end))
            {
                arr.add(s.substring(start,end+1));
                helper(s,ans,arr,end+1);
                arr.remove(arr.size()-1);
            }
        }
    }

    private boolean is_palindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}