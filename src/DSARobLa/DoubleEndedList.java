package DSARobLa;

public class DoubleEndedList {

    private Node first;
    private Node last;

    public DoubleEndedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insertStart(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            this.last = newNode;
        }
        newNode.next = this.first;
        this.first = newNode;

    }

    public void insertEnd(int data) {

        Node newNode = new Node(data);
        
        if (!isEmpty()) {
            this.last.next = newNode;
            this.last = newNode;
        } else {
            this.first = newNode;
            this.last = newNode;
        }

    }

    public void display() {
        Node currNode = this.first;
        while (currNode != null) {
            currNode.displayNode();
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        DoubleEndedList dEL = new DoubleEndedList();

        dEL.insertStart(0);
        dEL.insertStart(1);
        dEL.insertStart(2);
        dEL.insertStart(3);
        dEL.insertStart(4);
        dEL.insertStart(5);
        dEL.insertStart(6);
        dEL.insertStart(7);

        dEL.display();

        DoubleEndedList dEL2 = new DoubleEndedList();

        dEL2.insertEnd(0);
        dEL2.insertEnd(1);
        dEL2.insertEnd(2);
        dEL2.insertEnd(3);
        dEL2.insertEnd(4);
        dEL2.insertEnd(5);
        dEL2.insertEnd(6);
        dEL2.insertEnd(7);

        dEL2.display();
    }

}
