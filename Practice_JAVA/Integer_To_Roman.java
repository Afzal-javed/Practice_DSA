public class Integer_To_Roman {
    public static void main(String[] args) {
        int n=3;
        System.out.println(InttoRoman(n));
    }
    static String InttoRoman(int s){
        String ans="";
        if(s==0){
            return ans;
        }
        while (s>0){
            if(s>=1000){
                ans+="M";
                s-=1000;
            } else if(s>=900) {
                ans+="CM";
                s-=900;
            } else if(s>=500) {
                ans+="D";
                s-=500;
            }else if(s>=400){
                ans+="CD";
                s-=400;
            } else if(s>=100) {
                ans+="C";
                s-=100;
            } else if(s>=90) {
                ans+="XC";
                s-=90;
            } else if(s>=50) {
                ans+="L";
                s-=50;
            } else if(s>=40) {
                ans+="XL";
                s-=40;
            } else if(s>=10) {
                ans+="X";
                s-=10;
            } else if(s>=9) {
                ans+="IX";
                s-=9;
            } else if(s>=5) {
                ans+="V";
                s-=5;
            } else if(s>=4) {
                ans+="IV";
                s-=4;
            }else {
                ans+="I";
                s-=1;
            }
        }
        return ans;
    }
}
