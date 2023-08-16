import java.util.Arrays;

public class median_of_array {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};

        System.out.println(Arrays.toString(merge(nums1,nums2)));
        System.out.println(median(merge(nums1,nums2)));

    }
    static double median(int [] arr1){
        int len=arr1.length;

        double ans=0;

        if(arr1.length%2!=0){
             ans=arr1[arr1.length/2];
        }else{
            float temp1=arr1[len/2-1];
            float temp2=arr1[len/2];
            ans=(temp1+temp2)/2;
        }

        return ans;
    }
    static int[] merge(int[] nums1,int[] nums2){
        int len=nums1.length+nums2.length;
        int []arr=new int[len];
        int index=0;
        for (int i = 0; i < nums1.length; i++) {
                arr[index]=nums1[i];
                index++;
        }
        for (int i = 0; i < nums2.length; i++){
            arr[index]=nums2[i];
            index++;
        }
        Arrays.sort(arr);
        return arr;
    }
}
