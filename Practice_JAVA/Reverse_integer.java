public class Reverse_integer {
    public static void main(String[] args) {
        int n=-1534236469;





        System.out.println(reverse(n));
    }
    static int reverse(int x) {

        long ans=0;
        int tem=x;
        int rev=Math.abs(x);
        int divider=digitChecker(rev);
        while (rev>0){
            int rem=0;
            rem=rem+rev%10;
            ans=ans+rem*divider;
            divider=divider/10;
            rev=rev/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        if(tem<0){
            ans=ans*-1;
        }
        return (int)ans;
    }
    static int digitChecker(int n){
        int num=1;
        while (n>0){
            n=n/10;
            num=num*10;

        }
        return num/10;
    }
}
