public class Trees {
    static int idx=-1;
    public static void main(String[] args) {
        int []arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
       node root= createTree(arr);
        System.out.println(root);
    }

        public static node createTree(int[] arr) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }
            node newNode = new node(arr[idx]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);
            return newNode;
        }

}
class node {
    node left;
    node right;
    int data;
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}