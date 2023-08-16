import java.util.Stack;
public class Longest_Valid_Parenthesis {
    public static void main(String[] args) {
        String s="()()(()";
        System.out.println(longestValidParentheses(s));
    }
    static int longestValidParentheses(String s) {
        if (s == "") {
            return 0;
        }
        int ans = 0;
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (!st.empty()) {
                if (s.charAt(i) == ')'){
                    if(st.empty()){
                        return 0;
                    }
                   else if (st.peek() == '(') {
                        st.pop();
                        ans += 2;
                    } else {
                        return 0;
                    }

                }
            }
        }
        return ans;
    }
}
