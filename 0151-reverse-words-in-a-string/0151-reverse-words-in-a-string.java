class Solution {
    public String reverseWords(String s) {

        String[] word = s.split("\\s+");

        int right=word.length-1;
        StringBuilder sb=new StringBuilder();

        while(right >= 0){

            sb.append(word[right]).append(" ");
            right--;
            
        }

        return sb.toString().trim();
    }
}