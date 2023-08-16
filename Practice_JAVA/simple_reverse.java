public class simple_reverse {
    public static void main(String[] args) {
        int n=-123;
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        long rev=0;
        int x=n;
        n=Math.abs(n);
        while (n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev>Integer.MAX_VALUE){
            return 0;
        }
        if(x<0){
            return -1*((int)rev);
        }
        return (int)rev;
    }
}
