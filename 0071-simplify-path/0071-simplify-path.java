class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String folder = "";
        for(int i=0; i<=path.length(); i++){
            if(i == path.length() || path.charAt(i) == '/'){
                if(!st.isEmpty() && folder.equals("..")){
                    st.pop();
                }
                else if(!folder.isEmpty() && !folder.equals(".") && !folder.equals("..")){
                    st.push(folder);
                }
                folder = "";
            }
            else{
                folder += path.charAt(i);
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            ans = '/' + st.pop() + ans;
        }
        if(ans.isEmpty()){
            return "/";
        }
        return ans;
    }
}