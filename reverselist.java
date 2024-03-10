//reverse linkedlist using recursion and changing node
public class reverselist {
        Node head,tail;

    public reverselist(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node  newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public static void main(String[] args) {
        reverselist l = new reverselist();
        l.create(1);
        l.create(5);
        l.create(3);
        l.create(6);
        l.print(l.head);
        Node temp = l.reverse(l.head);

         System.out.println();
        l.print(temp);
    }
}
