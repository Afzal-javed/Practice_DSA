import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,0,result);
        return result;
    }
    private static void helper(int[] nums,int pos,List<List<Integer>> result){
        if(pos==nums.length-1){
            ArrayList<Integer> list=new ArrayList<>();
            for (int num: nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for (int i=pos;i< nums.length;i++){
            swap(nums,i,pos);
            helper(nums,pos+1,result);
            swap(nums,i,pos);
        }
    }
    private static void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
