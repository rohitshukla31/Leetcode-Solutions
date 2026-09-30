class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            String word = words[i];

            if(isValid(word,pattern)){
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean isValid(String word, String pattern){

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            char a = word.charAt(i);
            char b = pattern.charAt(i);

            if(map1.containsKey(a) && map1.get(a) != b){
                return false;
            }

            if(map2.containsKey(b) && map2.get(b) != a){
                return false;
            }

            map1.put(a,b);
            map2.put(b,a);
        }
        return true;

    }
}