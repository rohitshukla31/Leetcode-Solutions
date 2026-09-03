class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();

        int i=0;
        
        while(i<chars.length){
            int cnt=1;
            while(i + 1 <chars.length && chars[i]==chars[i+1]){
                cnt++;
                i++;
            }
            sb.append(chars[i]);
            if(cnt>1){
                sb.append(cnt);
            }
            i++;
        }
        for(int j=0; j<sb.length(); j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}