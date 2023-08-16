public class Divide_Two_Integer {
    public static void main(String[] args) {
        int dividend=-2147483648;
          int divisor= -3;
        System.out.println(ans(dividend,divisor));
    }
    static int ans(int dividend,int divisor){
        int c=0;
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MAX_VALUE&&divisor==1){
            return Integer.MAX_VALUE;
        }
        if(divisor==dividend){
            return 1;
        }
        boolean check=(dividend<0)^(divisor<0);

        long s=Math.abs((long)dividend);
        long h=Math.abs((long)divisor);
        if(divisor==-1){
            return dividend*-1;
        }
        if(divisor==1){
            return dividend;
        }
        if(s==h){
            if(check){
                return -1;
            }else {
                return 1;
            }
        }
        while ((s-h)>=0){
            c++;
            s=s-h;

        }
        if(check){
             c*=-1;
        }


        return c;
    }
}
