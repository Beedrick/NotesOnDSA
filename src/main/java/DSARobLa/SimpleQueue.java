/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class SimpleQueue {

    private int[] nums;
    private int rear;
    private int front;
    private int nElems;
    private int maxSize;

    public SimpleQueue(int max) {

        this.maxSize = max;
        this.nums = new int[maxSize];
        this.rear = -1;
        this.front = 0;
        this.nElems = 0;

    }

    public void insert(int value) {                //insert statement doesnt deal with a full queue only when the rear index reaches the top of the queue should implement something
        if(rear == maxSize - 1) {                   // if() statement checks if rear is pointing at the top of the queue 
            rear = -1;                                     // if it is then set rear = -1 returning the rear index to the bottom
        }
        this.nums[++rear] = value;              //if the above if() statement was true the rear index will increment to 0 (beginning of the queue) and stores the value there
        ++this.nElems;                                // number of elements is incremented
    }

    public int peek() {
        return this.nums[front];                  //returns the element stored at the front of the queue
    }
    
    public int remove(){
        int temp = nums[front++];           //stores the element at the front of queue to temp variable and then increments the front index
        if(front == maxSize){                   // if the front index is pointing at the top of the queue it is reset to 0
            front = 0;
        }
        nElems--;                                   //number of elements is decremented
        return temp;                               //method returns the removed element
    }
    
    public boolean isEmpty(){
        return (this.nElems == 0);
    }
    
    public int peekFront(){
        return this.nums[front];
    }
    
    public boolean isFull(){
        return (nElems == maxSize);
    }
    
    public int size(){
        return this.nElems;
    }
    
    public static void main(String[] args) {
        
        SimpleQueue sQ = new SimpleQueue(10);
        
        sQ.insert(4);
        sQ.insert(5);
        sQ.insert(6);
        sQ.insert(7);
        sQ.insert(8);
        sQ.insert(9);
        
        while(!sQ.isEmpty()){
            int n = sQ.remove();
            System.out.println(n + " ");
        }
        
        
        System.out.println(sQ);
        
        
        
    }

}
