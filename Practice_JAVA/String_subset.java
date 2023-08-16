import java.util.ArrayList;
import java.util.List;
public class String_subset {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(wordSubsets(words1,words2));
    }
    static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> str=new ArrayList<>();
        int i=0;
        while (i< words1.length) {
            int flag=1;
            for (int j = 0; j < words2.length; j++) {
                if (words1[i].contains(words2[j])){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                str.add(words1[i]);
            }
            i++;
        }
        return str;
    }
}
