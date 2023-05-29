package Tutorial5;

public class LinkedList {

    Node head;
    Node tail;
    boolean isDoubledLinkedList = false;
    int size = 0;

    public LinkedList(String[] dataList) {
        Node node = new Node();
        head = node;
        Node current = head;
        node.data = dataList[0];

        for (int i = 1; i < dataList.length; i++) {
            node = new Node();
            node.data = dataList[i];
            node.next = null;
            node.prev = null;
            current.next = node;
            current = current.next;
            size++;
        }
        tail = current;
    }

    public void printList(boolean reversely) {
        if (reversely) {
            printListReversley(head);
        } else {
            printList(head);
        }
    }

    private void printList(Node current) {
        System.out.println(current.data);
        if (current.next != null) {
            printList(current.next);
        }
    }

    private void printListReversley(Node current) {
        if (current.next != null) {
            printListReversley(current.next);
        }
        System.out.println(current.data);
    }

    public void printListByLinker() {
        for (Node current = head; current != null; current = current.next) {
            System.out.println(current.data);
        }

        for (Node current = tail; current != null; current = current.prev) {
            System.out.println(current.data);
        }
    }

    public void toDoublyLinkedList() {
        toDoublyLinkedList(head);
        isDoubledLinkedList = true;
    }

    public Node toDoublyLinkedList(Node current) {

        Node node = new Node();
        Node head = current;
        node = current;
        node = node.next;

        while (current != null) {

            node.prev = current;
            current = current.next;
            if (node.next != null) {
                node = node.next;

            }

        }

        return head;

    }

}
