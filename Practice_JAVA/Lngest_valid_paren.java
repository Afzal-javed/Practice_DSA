import java.util.Stack;

public class Lngest_valid_paren {
    public static void main(String[] args) {
        String s="()()(()()()()";
        System.out.println(longestValidParentheses(s));
    }
    static int longestValidParentheses(String s) {

            int result =0;
            Stack<Integer> st=new Stack<Integer>();
            st.push(-1);
            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)=='('){
                    st.push(i);
                }
                else {
                    st.pop();
                    if(st.empty()) st.push(i);
                    else result =Math.max(result, i-st.peek());
                }
            }
            return result;
        }



}
