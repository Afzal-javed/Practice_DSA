public class First_Missing_Positive {
    public static void main(String[] args) {
        int[]nums = {-1,-1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i< nums.length) {
            int curr=nums[i]-1;
            if(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[curr]){
                swap(nums,i,curr);
            }else{
                i++;
            }
        }
        for(int ind=0;ind< nums.length;ind++){
            if(nums[ind]!=ind+1){
                return ind+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[]arr,int i,int curr){
        int temp=arr[i];
        arr[i]=arr[curr];
        arr[curr]=temp;
    }
}
