import java.util.ArrayList;
import java.util.List;

public class vowelcheck {
    public static void main(String[] args) {
        String s="Uo";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        String s1=s.toLowerCase();
        List<Character> l=new ArrayList<>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2&&l.contains(s.charAt(i))){
                a++;
            }
            if(i>=s.length()/2&&l.contains(s.charAt(i))){
                b++;
            }
        }
        return a==b;
    }
}

