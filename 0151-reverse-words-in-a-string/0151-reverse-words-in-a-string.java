class Solution {
    public String reverseWords(String s) {

        // String[] word = s.split("\\s+");

        // int right=word.length-1;
        // StringBuilder sb=new StringBuilder();

        // while(right >= 0){

        //     sb.append(word[right]).append(" ");
        //     right--;
            
        // }

        // return sb.toString().trim();

        //==========optimal approach=========
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            // remove all trailing spaces
            while(i>0 && s.charAt(i) == ' '){
                i--;
            }

            //cheack value of i
            if(i < 0){
                break;
            }

            int j = i;
            // find the starting index of word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi j space wali index pe aayega toh rukk jayega
            //ab iss word ko apne ans me append kr do
            ans.append(s.substring(j+1, i+1));
            //remove extra space where j is standing and add space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }

            // j < 0 no space needed
            // j > 0 space needed
            if(j >= 0){
                ans.append(' ');
            }
            //place i at last index of remaining string
            i = j;
        }
        return ans.toString();
    }
}