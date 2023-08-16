public class String_reverse {
    public static void main(String[] args) {
        String str="I really love you      Shefta    ";
        Reverse(str);
    }
    static void Reverse(String str){
        String[] str1=str.split(" ");
        System.out.println(str1.length);
        int j=0;
        for (int i = str1.length-1; i >=0 ; i--) {
           if(str1[i] != " ") {
              System.out.print(str1[i] + " ");
           }
        }
    }
}
