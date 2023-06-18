/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class LinkedList {

    private Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public boolean isEmpty() {
        if (this.firstNode == null) {
            return true;
        }

        return false;
    }

    public void insertNode(int index, int data) {

        if (!isEmpty()) {
            Node currNode = this.firstNode;
            Node prevNode = currNode;

            if (this.firstNode.data == index) {
                this.insertNodeToStart(data);
                System.out.println("Node added");
                return;
            }

            while (currNode != null) {
                if (currNode.data == index) {
                    prevNode.next = new Node(data);
                    prevNode.next.next = currNode;
                }

                prevNode = currNode;
                currNode = currNode.next;
            }

            if (currNode == null) {
                System.out.println("Error: No such index.");
                return;
            }

        }
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            Node tempNode = firstNode;
            this.firstNode = firstNode.next;
            System.out.println("Node deleted: ");
            tempNode.displayNode();
        } else {
            System.out.println("Error: List is empty.");
        }
    }

    public void searchDelete(int key) {
        if (!isEmpty()) {

            Node currNode = firstNode;
            Node prevNode = currNode;

            if (firstNode.data == key) {
                deleteFirst();
                System.out.println("Node deleted");
                return;
            }

            while (currNode.data != key) {
                prevNode = currNode;
                currNode = currNode.next;

            }
            System.out.println("Node deleted");
            currNode = currNode.next;
            prevNode.next = currNode;

        }
    }

    //since there is no reference to last node must traverse the whole list to reach the last node
    //double ended list solves this inefficiency
    public void insertNodeToEnd(int data) {
        if (isEmpty()) {
            this.firstNode = new Node(data);
        } else {
            Node currNode = firstNode;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new Node(data);
        }
    }

    public void insertNodeToStart(int data) {
        if (isEmpty()) {
            this.firstNode = new Node(data);
        } else {

            Node currNode = new Node(data);
            currNode.next = this.firstNode;
            this.firstNode = currNode;

        }
    }

    public void displayList() {
        if (!isEmpty()) {

            Node currNode = this.firstNode;

            while (currNode != null) {
                currNode.displayNode();
                currNode = currNode.next;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insertNodeToEnd(0);
        myList.insertNodeToEnd(1);
        myList.insertNodeToEnd(2);
        myList.insertNodeToEnd(3);
        myList.insertNodeToEnd(4);
        myList.insertNodeToEnd(5);

        myList.displayList();

        System.out.println("\n");

        myList.insertNode(7, 15);
        myList.displayList();

        //LinkedList myListBack = new LinkedList();

        /*    myListBack.insertNodeToStart(0);
        myListBack.insertNodeToStart(1);
        myListBack.insertNodeToStart(2);
        myListBack.insertNodeToStart(3);
        myListBack.insertNodeToStart(4);
        myListBack.insertNodeToStart(5);

        myListBack.displayList();
        myListBack.deleteFirst();
        System.out.println("\n");
        myListBack.displayList();
        myListBack.deleteFirst();
        System.out.println("\n");
        myListBack.displayList();
        myListBack.deleteFirst();
        System.out.println("\n");
        myListBack.displayList();
        
        myList.searchDelete(0);
        System.out.println("\n");
        myList.displayList();*/
    }

}
