package DSARobLa;

public class LinkedStack {

    Node topNode;
    int nElems;

    public LinkedStack() {
        nElems = 0;
        topNode = null;
    }

    public boolean isEmpty() {
        if (this.topNode == null) {
            return true;
        }

        return false;
    }

    public void push(int data) {

        Node newNode = new Node(data);
        newNode.next = topNode;
        topNode = newNode;

        ++nElems;

    }

    public int pop() {
        Node currentNode = topNode;

        if (isEmpty()) {
            System.out.println("Error empty stack!");
            return 0;
        }

        Node temp = topNode;
        topNode = topNode.next;
        --nElems;

        return temp.data;
    }

    public static void main(String[] args) {
        LinkedStack linSta = new LinkedStack();

        linSta.push(0);
        linSta.push(1);
        linSta.push(2);
        linSta.push(3);
        linSta.push(4);

        System.out.println(linSta.pop());
        System.out.println(linSta.pop());
        System.out.println(linSta.pop());
        System.out.println(linSta.pop());
        System.out.println(linSta.pop());
        System.out.println(linSta.pop());

    }

}
