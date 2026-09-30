class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i=0; i<strs.length; i++){
            if(visited[i]){
                continue;
            }
            List<String> res = new ArrayList<>();

            String str = strs[i];
            res.add(str);
            visited[i]=true;

            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            for(int j=i+1; j<strs.length; j++){
                if(visited[j]){
                    continue;
                }
                String s = strs[j];
                
                if(isValid(ch, s)){
                    res.add(s);
                    visited[j]=true;
                }

            }
            ans.add(res);
        }
        return ans;
    }

    public boolean isValid(char[] ch, String s){
    
        char[] arr = s.toCharArray();
        if(arr.length != ch.length){
            return false;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(ch[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}