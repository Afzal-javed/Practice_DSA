public class Search_Insert_Position {
    public static void main(String[] args) {
        int[]arr={1,3,4,5,6};
        int target=9;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target) return m;
            else if(target>nums[m]) s=m+1;
            else e=m-1;
        }
        return s;
    }
}
