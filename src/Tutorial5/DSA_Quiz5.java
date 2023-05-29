package Tutorial5;

public class DSA_Quiz5 {
    
    public static void main(String[] args) {
        
        String[] data = {"a", "b", "c", "d", "e"};
        LinkedList list = new LinkedList(data);
        list.printList(false); 
        list.toDoublyLinkedList();
        System.out.println(list.isDoubledLinkedList);
        
        
        
    }
    
}
