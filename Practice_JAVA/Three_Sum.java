import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                int s=3;
                List<Integer> temp=new ArrayList<Integer>();
                for(int k=j+1;k<nums.length;k++){
                    int c=nums[i]+nums[j]+nums[k];
                    if(c==0){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(!lst.contains(temp)){
                            lst.add(temp);
                        }
                    }
                }
            }
        }
        return lst;
    }
}
