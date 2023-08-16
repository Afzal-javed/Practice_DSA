import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
        //[9,8,7,6,5,4,3,2,1,1]
    }
    static int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] res = new int[digits.length+1];

        for (int i=0; i<digits.length; i++) {
            res[i+1] = digits[i];
        }

        res[0] = 1;

        return res;
    }
}
