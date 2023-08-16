public class Valid_Palindrome {
    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122){
                str+=s.charAt(i);
            }
        }
        int start=0;
        int e=str.length()-1;
        while(start<=e){
            if(str.charAt(start)!=str.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}
