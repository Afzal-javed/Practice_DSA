import java.util.Scanner;

public class Binary_Tree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
       node root= createTree();
        System.out.println("Inorder : ");
       inorder(root);
        System.out.println();
        System.out.println("Preorder : ");
       preorder(root);
        System.out.println();
        System.out.println("Postorder : ");
       postorder(root);
    }
    static node createTree(){
        node root=null;
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new node(data);

        System.out.println("enter data for " +root.data +" left sub tree");
        root.left=createTree();
        System.out.println("enter data for "+root.data +" right sub tree");
        root.right=createTree();

        return root;
    }
    static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" -> ");
        inorder(root.right);

    }
    static void preorder(node root){
        if(root==null) return;
        System.out.print(root.data +" -> ");
        preorder(root.left);
        preorder(root.right);

    }
    static void postorder(node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" -> ");


    }
}
class Tree{
    node left,right;
    int data;
    public Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
