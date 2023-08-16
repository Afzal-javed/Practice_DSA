import java.util.Scanner;

public class Btree {
    static Scanner input=null;
    public static void main(String[] args) {
        input=new Scanner(System.in);
        node root=create();
        System.out.println("inorder :");
        inorder(root);
        System.out.println("preorder :");
        preorder(root);
        System.out.println("postorder :");
        postorder(root);
    }
    static node create(){
        node root=null;
        System.out.println("enter data");
        int data=input.nextInt();
        if(data==-1){
            return null;
        }
        root=new node(data);
        System.out.println("enter data for left sub tree "+root.data);
        root.left=create();
        System.out.println("enter data for right sub tree "+root.data);
        root.right=create();
        return root;

    }
    static void inorder(node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ->");
        inorder(root.right);
    }
    static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ->");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ->");
    }
}
class Node{
    node left;
    node right;
    int data;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
