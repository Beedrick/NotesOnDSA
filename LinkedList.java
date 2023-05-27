package LearningCollections;


//A Simple LinkedList class that demonstrates the underlying structure of Lists 
//implemented using LinkedLists
public class LinkedList {

    //object of type Node created to store the reference of the first data value
    //if this object is lost, then all links are lost.
    Node head;

    //Constructor that initializes head as null to represent an empty list.
    public LinkedList() {
        this.head = null;
    }

    //add method that takes in an int data. A new Node object is created to 
    //store the data into the new Node that will be added to the end of the
    //linked list. If the head == null that means the linked list is empty
    //so we assign it the new Node. else if head != null then the list is 
    //not empty. Since the list is not empty we must find an empty Node to 
    //store the new Node. Remember that each node contains two fields. An
    //int variable and a Node object representing the Node value and the Node
    //next to it. 
    //An important point about Node currNode = head; is that when assigning head 
    //to currNode, it is the reference in memory of head that is being assigned 
    //to currNode. This means that currNode the address of currNode.data = the address of head.data
    //which means if we update currNode.next = currNode we are updating head.next; This is only true 
    //if head.next == null; but this is true for the successive nodes. Finally currNode.next = newNode
    //assigns the new Node into the linkedlist end.
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
// a simple display method that will print to the console the data of each node
    public void display() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

    }

}
