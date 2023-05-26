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

    public void insert(int value) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        this.nums[++rear] = value;
        ++this.nElems;
    }

    public int peek() {
        return this.nums[front];
    }
    
    public int remove(){
        int temp = nums[front++];
        if(front == maxSize){
            front = 0;
        }
        nElems--;
        return temp;
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
