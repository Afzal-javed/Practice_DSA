import java.util.Arrays;

public class Top_k_most_frequent_element {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(arr,k)));
    }
    static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int[] freq = new int[100000];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int temp=-1;
        for (int i = 1; i <= k; i++) {
            int idx=0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (freq[j] > max && freq[j]!=temp) {
                    max = freq[j];
                    idx=j;
                }
            }
            arr[i - 1] = idx;
            temp=freq[idx];
        }
        return arr;
    }
}
