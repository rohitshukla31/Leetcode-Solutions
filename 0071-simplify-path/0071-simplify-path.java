class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        //path ko / se split kr denge
        String[] strs = path.split("/");

        for(String str: strs){

            if(str.equals(".") || str.isEmpty()){
                continue;
            }

            else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            
            else{
                st.push(str);
            }
        }

        if(st.isEmpty()){
            return "/";
        }
        
        StringBuilder ans = new StringBuilder();
        for(String dir: st){
            ans.append("/").append(dir);
        }
        return ans.toString();



        //===================2nd method==============================
        // Stack<String> st = new Stack<>();
        // String folder = "";
        // for(int i=0; i<=path.length(); i++){
        //     if(i == path.length() || path.charAt(i) == '/'){
        //         if(!st.isEmpty() && folder.equals("..")){
        //             st.pop();
        //         }
        //         else if(!folder.isEmpty() && !folder.equals(".") && !folder.equals("..")){
        //             st.push(folder);
        //         }
        //         folder = "";
        //     }
        //     else{
        //         folder += path.charAt(i);
        //     }
        // }

        // String ans = "";
        // while(!st.isEmpty()){
        //     ans = '/' + st.pop() + ans;
        // }
        // if(ans.isEmpty()){
        //     return "/";
        // }
        // return ans;
    }
}