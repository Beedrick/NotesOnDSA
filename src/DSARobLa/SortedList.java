package DSARobLa;

public class SortedList {

    private Node first;

    public SortedList() {

        this.first = null;

    }

    public void insert(int data) {

        Node prevNode = null;
        Node currNode = this.first;
        Node newNode = new Node(data);

        while (currNode != null && data > currNode.data) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (prevNode == null) {
            this.first = newNode;
            newNode.next = currNode;
        } else {
            prevNode.next = newNode;
            newNode.next = currNode;
        }
    }

    public boolean isEmpty() {
        return (this.first == null);
    }
    
    public void display(){
        
        Node currNode = this.first;
        while(currNode != null){
            currNode.displayNode();
            currNode = currNode.next;
        }
        
    }

    public static void main(String[] args) {
        SortedList sL = new SortedList();

        sL.insert(13);
        sL.insert(5);
        sL.insert(12);
        sL.insert(15);
        sL.insert(16);
        sL.insert(9);
        sL.insert(7);
        sL.insert(18);
        sL.insert(21);
        sL.insert(0);
        
        sL.display();
    }

}
