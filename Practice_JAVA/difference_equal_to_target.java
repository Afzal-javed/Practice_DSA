import java.util.Arrays;

public class difference_equal_to_target {
    public static void main(String[] args) {
        int[] arr1={3,4,10};
        int[] arr2={1,4,8};
        int target=12;
        System.out.println(Arrays.toString(difference(arr1,arr2,target)));
    }
    static int[] difference(int[] arr1,int[] arr2,int target){
        int[] nums = {-1,-1};
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0;j< arr2.length;j++){
                int c=Math.abs(arr1[i]-arr2[j]);
                if(c==target){
                    nums[0]=i;
                    nums[1]=j;
                    return nums;
                }
            }
        }
        return nums;
    }
}
