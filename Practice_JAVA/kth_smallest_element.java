import java.util.ArrayList;
import java.util.List;

public class kth_smallest_element {
    public static void main(String[] args) {
        int[][]m={{1,2},{1,3}};
        int k=2;
        System.out.println(kthSmallest(m,k));
    }
    static int kthSmallest(int[][] m, int k) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                lst.add(m[i][j]);
            }
        }
        return lst.get(k-1);
    }
}
