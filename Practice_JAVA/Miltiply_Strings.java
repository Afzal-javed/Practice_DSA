import java.math.BigInteger;

public class Miltiply_Strings {
    public static void main(String[] args) {
        String num1="200";
        String num2="300";
        System.out.println(multiply(num1,num2));
    }
    static String multiply(String num1, String num2) {
        BigInteger A, B;
        A  = new BigInteger(num1);
        B  = new BigInteger(num2);
        return ""+A.multiply(B);
    }
}
