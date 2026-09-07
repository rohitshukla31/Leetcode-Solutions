class Solution {
    public String longestPalindrome(String s) {
        int maxLen=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            // for odd length;
    
            int left=i;
            int right=i;
            while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                int length=right-left+1;
                if(maxLen<length){
                    start=left;
                    maxLen=length;
                }
                left--;
                right++;
            }
        
            // for even length
            
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                int length=right-left+1;
                if(maxLen<length){
                    start=left;
                    maxLen=length;
                }
                left--;
                right++;
            
            }
        }
        int end=start + maxLen;
        String substr= s.substring(start,end);
        // String substr = "";
        // for(int i=start; i<end; i++){
        //     substr += s.charAt(i);
        // }
        return substr;
    }
}