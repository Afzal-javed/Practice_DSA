import java.util.Arrays;

public class First_and_Last_Position {
    public static void main(String[] args) {
        int[] nums = {3,4,5,5,5,5,6,7,9};
        int target = 5;
        System.out.println(Arrays.toString(result(nums,target)));
    }
    static int[] result(int[] nums,int target) {
        int[] arr = {-1, -1};
        if(nums.length==0){
            return arr;
        }

        int first = searchRange(nums, target);
        int last=searchRangelast(nums,target);
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
    static int searchRangelast(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if (nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
    static int searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if (nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
}
