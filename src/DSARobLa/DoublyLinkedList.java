package DSARobLa;

public class DoublyLinkedList {

    private DoubleNode first;
    private DoubleNode last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insertStart(int data) {

        DoubleNode newNode = new DoubleNode(data);

        if(isEmpty()){
            this.last = newNode;        //must be this.last to be initialized with newNode if empty as it holds reference so that it can be linked to the start of list
        }else{
            first.previous = newNode;
        }
        
        newNode.next = this.first;
        this.first = newNode;
        
    }

    public void insertEnd(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        }
    }

    public void display() {
        DoubleNode currNode = this.first;
        while (currNode != null) {
            currNode.display();
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();

        dLL.insertStart(0);
        dLL.insertStart(1);
        dLL.insertStart(2);
        dLL.insertStart(3);
        dLL.insertStart(4);

        dLL.display();
    }

}
