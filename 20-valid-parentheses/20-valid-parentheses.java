class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                st.push(s.charAt(i));
            } else if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(st.isEmpty()){
                    return false;
                }
                if(isEqual(st.peek(), s.charAt(i))){
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEqual(char c1, char c2){
        if(c1 == '(' && c2 == ')'){
            return true;
        }
        if(c1 == '{' && c2 == '}'){
            return true;
        }
        if(c1 == '[' && c2 == ']'){
            return true;
        }
        return false;
    }
}