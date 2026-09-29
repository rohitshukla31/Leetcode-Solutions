class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        int start = 0;
        while(start < s.length()){
            int first = start;
            int last = Math.min(start + k - 1, s.length() - 1);
            
            while(first < last){
                char temp = sb.charAt(last);

                sb.setCharAt(last, sb.charAt(first));
                sb.setCharAt(first, temp);

                first++;
                last--;

            }

            start += 2 * k;
        }
        return sb.toString();
    }
}