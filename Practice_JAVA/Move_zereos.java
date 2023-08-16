import java.util.Arrays;

public class Move_zereos {
    public static void main(String[] args) {
        int[]ar={0,1,0,3,12};
       moveZeroes(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&i<nums.length-c-1){
                swap(nums,i,nums.length-c-1);
                c++;
            }
        }
        for(int i=0;i<nums.length-c-1;i++){
            if(nums[i]>nums[i+1]){
                swap(nums,i,i+1);
            }
        }
    }
    static void swap(int[]arr,int f,int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
