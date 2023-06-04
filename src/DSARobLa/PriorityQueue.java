/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class PriorityQueue {

    private int[] pQ;
    private int rear;
    private int front;
    private int nElem;

    //initializes and empty priority queue
    public PriorityQueue(int max) {

        this.pQ = new int[max];
        this.rear = 0;
        this.front = -1;
        this.nElem = 0;

    }

    public void insert(int val) {

        if (isEmpty()) {
            pQ[0] = val;
            ++front;
            ++nElem;
            return;
        } else if (isFull()) {
            System.out.println("Queue is full, remove an item to insert a new item.");
            return;
        }

        int index;

        for (index = front; index >= 0; index--) {
            if (pQ[index] < val) {

                pQ[index + 1] = pQ[index];

            } else{
                break;
            }
        }

        pQ[index + 1] = val;

        ++front;
        ++nElem;

    }
    
    public int remove(){
        int removedNum = pQ[front];
        
        --front;
        --nElem;
        
        return removedNum;
    }
    

    //returns false if queue is empty
    public boolean isEmpty() {
        if (this.nElem == 0) {
            return true;
        }
        return false;
    }

    //returns true if queue is full
    public boolean isFull() {
        if (this.nElem == this.pQ.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < this.nElem; ++i) {
            output += pQ[i] + " ";
        }

        return output;

    }

    public static void main(String[] args) {

        PriorityQueue prior = new PriorityQueue(10);

        prior.insert(100);

        prior.insert(90);

        prior.insert(200);

        System.out.println(prior);
        
        prior.remove();
        
        System.out.println(prior);
        
        prior.insert(45);

        prior.insert(12);

        prior.insert(67);

        prior.insert(86);

        prior.insert(23);

        prior.insert(40);

        prior.insert(221);

        prior.insert(333);
        
        System.out.println(prior);

        prior.insert(789);


    }

}
