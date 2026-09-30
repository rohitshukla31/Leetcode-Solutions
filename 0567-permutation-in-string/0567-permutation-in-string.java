class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);

        for(int i=0; i<=s2.length() - s1.length(); i++){
            String str = s2.substring(i,i+s1.length());
            if(isPalindrome(str,ch))
            {
                return true;
            }
        }
        return false;

    }

    public boolean isPalindrome(String str, char[] ch){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] != ch[i]){
                return false;
            }
        }
        return true;
    }
}