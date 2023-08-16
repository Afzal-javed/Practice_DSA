import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        int[] ans={-1,-1};
        while(i<nums.length){
            if(j!=i&&nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            if(j== nums.length-1){
                i++;
                j=0;
            }
            j++;
        }
        return ans;
    }
}

