import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[] arr={1,1,2,2,3,3,3,4,4,4,4};
        System.out.println(duplicates(arr));

    }
    static int perime(int n){
        for (int i = 2; i < n/2; i++) {
            if(n==2||n==3){
                return 1;
            } else if (n%i!=0) {
                return 1;
            }
            else {
                return -1;
            }
        }
        return 1;
    }
    static void pattern(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println( );
        }
    }
    static int[] rev(int [] arr){
        int i=0;
        int end= arr.length-1;
        while (i<=end){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            i++;
            end--;
        }
        return arr;
    }
    static int count(String str){
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65&&str.charAt(i)<=90){
                c++;
            }
            if(str.charAt(i)>=97&&str.charAt(i)<=122){
                c++;
            }
        }
        return c;
    }
    static List<Integer> duplicates (int[] arr){
        List<Integer> lst=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!lst.contains(arr[i])){
                lst.add(arr[i]);
            }
        }
        return lst;
    }
}
