public class Perfect_number {
    public static void main(String[] args) {
        int x=121;
        System.out.println(PerfectNumber(x));
    }
    static int PerfectNumber(int x){
        int sum=0;
        while (x>0){
            sum+=x%10;
            x=x/10;
        }
        if(sum%5==0) return 1;
        return 0;
    }
}
