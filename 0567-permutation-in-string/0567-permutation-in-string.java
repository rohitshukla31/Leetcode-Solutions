class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //=================solved by Frequency count ==================
        if(s1.length() > s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            int windIdx = 0;
            int idx = i;
            int[] windFreq = new int[26];

            while (windIdx < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++;
                idx++;
            }

            if (Arrays.equals(freq, windFreq)) {
                return true;
            }
        }
        return false;

        // if(s1.length() > s2.length()){
        //     return false;
        // }

        // char[] ch = s1.toCharArray();
        // Arrays.sort(ch);

        // for(int i=0; i<=s2.length() - s1.length(); i++){
        //     String str = s2.substring(i,i+s1.length());
        //     if(isPalindrome(str,ch))
        //     {
        //         return true;
        //     }
        // }
        // return false;

    }

    // public boolean isPalindrome(String str, char[] ch){
    //     char[] arr = str.toCharArray();
    //     Arrays.sort(arr);
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] != ch[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}