public class Minimun_time_to_rope_color_1578 {
    public static void main(String[] args) {
        String str="aaabbbabbbb";
             int[] arr=   {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(str,arr));
    }
    static int minCost(String str, int[] time) {
        char match=str.charAt(0);
        int min=0;
        int fv=time[0];
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==match){
                if(fv>time[i]){
                    min+=time[i];

                }else{
                    min+=fv;
                    fv=time[i];
                }
            }
            else{
                match=str.charAt(i);
                fv=time[i];
            }
        }
        return min;
    }
}
