public class Permutation_in_String {
    public static void main(String[] args) {
        String s1="a";
        String s2="ab";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
            if(i-s1.length()>=0){
                arr[s2.charAt(i-s1.length())-'a']++;
                if(zero(arr)) return true;
            }
        }
        return false;
    }
    private static boolean zero(int[] arr){
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
