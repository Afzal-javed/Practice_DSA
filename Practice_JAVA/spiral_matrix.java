import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][]mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(mat));
    }
    static List<Integer> spiral(int[][]mat){
            List<Integer> lst=new ArrayList<>();
            int top=0;
            int m=mat.length-1;
            int bott=0;
            int n=mat[0].length-1;
            while(top<=m&&bott<=n){
                for(int i=top;i<=n;i++){
                    lst.add(mat[top][i]);
                }
                for(int i=top+1;i<=m;i++){
                    lst.add(mat[i][n]);
                }
                if(top+1<=m){
                    for(int i=n-1;i>=bott;i--){
                        lst.add(mat[m][i]);
                    }
                }
                if(bott+1<=n){
                    for(int i=m-1;i>top;i--){
                        lst.add(mat[i][bott]);
                    }
                }
                top++;
                m--;
                bott++;
                n--;
            }
            return lst;
    }
}
