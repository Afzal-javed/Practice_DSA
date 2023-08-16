import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sceond_minimum_node {
    public static void main(String[] args) {

    }
    List<Integer> lst=new ArrayList<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int ans=-1;
        helper(root);
        Collections.sort(lst);;
        for(int i=1;i<lst.size();i++){
            if(lst.get(i)!=lst.get(i-1)){
                ans=lst.get(i);
                return ans;
            }
        }
        return ans;
    }
    public void helper(TreeNode root){
        if(root==null) return ;
        lst.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
