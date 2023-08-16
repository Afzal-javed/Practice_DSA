public class number_of_1_bits {
    public static void main(String[] args) {
        int n=0000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int s=0;
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                s++;
            }
        }
        return s;
    }
}
