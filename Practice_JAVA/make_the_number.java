public class make_the_number {
    public static void main(String[] args) {
        int x=1;
        System.out.println(MakeTheNumber(x));
    }
    static int MakeTheNumber(int x){
        if(x==1) return 1;
        int n=x+1;
        while(n>0){
            int fact=0;
            for (int i = 1; i <=n; i++) {
                if(n%i==0){
                    fact++;
                }
            }
            if(fact==x) return n;
            n++;


        }
        return -1;
    }
}
