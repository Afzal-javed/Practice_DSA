import java.util.Stack;

public class Valid_paranthesis {
    public static void main(String[] args) {
        String s="(){}[]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {

        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st=new Stack<Character>();
        for(int i =0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}
