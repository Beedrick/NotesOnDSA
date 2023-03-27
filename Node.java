
package LearningCollections;

//Node class that stores data representing the data being stored in this current node
//and and Object Node called next that stores the node that comes after it. If next 
//is empty, then the current node is either the head, the last node, or the linked 
//list is empty.
class Node {

    int data;
    Node next;
//a constructor that initializess data and next.
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
