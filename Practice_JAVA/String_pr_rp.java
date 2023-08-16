import java.util.ArrayList;

public class String_pr_rp {
    public static void main(String[] args) {
        int [] arr={1,2,3 ,7 ,5};
        int s=12;
       // String S="prpptppr";
        System.out.println(subarraySum(arr,s));
    }

    //Function to find a continuous sub-array which adds up to a given number.
    public static ArrayList<Integer> subarraySum(int[] arr, int s)
    {
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i+1;j<arr.length;j++){
                temp+=arr[j];
                if(temp==s){
                    lst.add(i+1);
                    lst.add(j+1);
                    return lst;
                }
            }
        }
        return lst;
    }
  /*  static long solve(int X,int Y, String S)
    {
        int countx=0;
        int county=0;
        // code here
        for(int i=0;i<S.length();i++){
            if(S.contains("pr")){
              S=  S.replace("pr","");
                countx++;
            }else if(S.contains("rp")){
               S= S.replace("rp","");
                county++;
            }
        }
        return countx*X+county*Y;
    }*/
}
