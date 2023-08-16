public class pattern {
    public static void main(String[] args) {
        int n=6;
        int h=n/2;
        int c=1;
        print(n,h,c);
    }
    static void print(int n,int h,int c){
        for (int i = 1; i <= n; i++) {
            if(i<=h){
                for(int j=0;j<h-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print(k);
                }
            }
            else {
                if (i != h + 1) {
                    for (int l = 0; l < c; l++) {
                        System.out.print(" ");
                    }
                    c++;
                }
                for (int m = 2 * h - 1; m > 0; m--) {
                    System.out.print(m);
                }
                h--;
            }
                System.out.println();

        }
    }
}
