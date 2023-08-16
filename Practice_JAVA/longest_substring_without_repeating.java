import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating {
    public static void main(String[] args) {
        String  s = "aab";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        int j=0;
        int i=0;
        int maxlen=0;
        Set<Character> set=new HashSet<>();
        while (i<s.length()){
            char alpha=s.charAt(i);
            if(set.contains(alpha)){
                char rem=s.charAt(j);
                set.remove(rem);
                j++;

            }
            else{
                set.add(alpha);
                i++;
                maxlen=Math.max(maxlen,set.size());
            }
        }
        return maxlen;
    }
}
