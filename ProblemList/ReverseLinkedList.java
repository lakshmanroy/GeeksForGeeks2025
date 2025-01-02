public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public void print(Node head){
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
      }
      System.out.println("Null");
    }
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {

        ReverseLinkedList list=new ReverseLinkedList();

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        System.out.println("original number is:");
        list.print(head);

        head=list.reverse(head);

        System.out.println("reverse a number:");
        list.print(head);
        
    }
}
