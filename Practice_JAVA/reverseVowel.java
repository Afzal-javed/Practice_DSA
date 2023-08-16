import java.util.ArrayList;
import java.util.List;

public class reverseVowel {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
    static String reverseVowels(String s) {
        List<Character> lst=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                    ||(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
            {
                lst.add(s.charAt(i));
            }
        }
        String str="";
        int ls=lst.size()-1;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                    ||(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
            {
                str=str+lst.get(ls);
                ls--;
            }
            else{
                str=str+s.charAt(i);
            }
        }
        return str;
    }
}
