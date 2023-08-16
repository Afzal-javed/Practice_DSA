public class Remove_Element {
    public static void main(String[] args) {
       int[] nums = {3,2,2,3};
       int val = 3;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;
                i++;
            }
        }
        return i;
    }
}
