public class Link_List {
    public static void main(String[] args) {
        Link_List lst=new Link_List();
        lst.insert(5);
        lst.insert(6);
        lst.insert(8);
        lst.at_end(9);
        lst.at_end(10);
        lst.delete(9);
        lst.display();

    }
    Node head;
    public void delete(int data){
        Node temp=head;
        if (head.data==data){
            head=head.next;
        }
            while (temp.next!=null){
                if(temp.next.data==data){
                    Node temp1=temp.next;
                    temp.next=temp1.next;
                }
                temp=temp.next;
            }

    }
    public void at_end(int data){
        Node temp=head;
        Node temp1=new Node(data);
        if(head==null){
            head=temp;
        }else{
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=temp1;
        }



    }
    public void insert(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else {
            temp.next=head;
            head=temp;
        }
    }
    public void display(){
        while (head!=null){
            System.out.print(head.data +" -> ");
            head=head.next;
        }
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
