public class Best_time_to_buy {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<min){
                min=p[i];
            }


            maxPrice=Math.max(maxPrice,p[i]-min);
        }
        return maxPrice;
    }
    }

