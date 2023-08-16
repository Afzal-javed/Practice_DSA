public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static  Node bst(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=bst(root.left,val);
        }
        else {
            root.right=bst(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        int [] val={2,1,3,4,5,7};
        Node root=null;
        for (int i = 0; i < val.length; i++) {
            bst(root,val[i]);
        }
        inorder(root);

    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data +" -> ");
        inorder(root.right);
    }
}

