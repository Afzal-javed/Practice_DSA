public class Flowers {
    public static void main(String[] args) {
        int[]arr={0,0,1,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] f, int n) {
        if(n==0) return true;
        int i=0;
        while (i<f.length){
            if(f[i]%2==1){
                i++;
            }else{
                if(f[i+1]==0&&i==0){
                    f[i]=1;
                    n--;
                }
                if(f[i-1]!=0){
                    i++;
                }else if(f[i+1]!=0){
                    i++;
                }else{
                    f[i]=1;
                    n--;
                }
            }
        }
        System.out.println(n);
        if(n==0){
            return true;
        }else{
            return false;
        }
    }
}
