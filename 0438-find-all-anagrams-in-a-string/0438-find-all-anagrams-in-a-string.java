class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        char[] arr = p.toCharArray();
        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<=s.length()-p.length(); i++){
            if(isAnagram(s.substring(i,i+p.length()), arr)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isAnagram(String str, char[] p){
        char[] arr1 = str.toCharArray();
        Arrays.sort(arr1);
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != p[i]){
                return false;
            }
        }
        return true;
    }
}