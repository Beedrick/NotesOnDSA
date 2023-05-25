/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class SimpleStack {

    private int max;
    private int[] a;
    private int top;

    //constructor sets top to -1 because no values been added to stack 
    //so there is no index 0 then there is no top so top = -1
    public SimpleStack(int max) {
        this.max = max;
        this.a = new int[max];
        this.top = -1;

    }

    //push increments top first then assigns value to that index of a[] 
    //now top stores the index of the top value in the array
    public void push(int value) {
        this.a[++top] = value;
    }
    
    //pop() returns the value at the top of the array and then decrements 
    //top so that if peek is ever called we can only see the value at top - 1
    //essentially the value still exists but is inaccessable 
    public int pop() {
        return this.a[top--];
    }

    //simply returns the top of the stack 
    public int peek() {
        return this.a[top];
    }
    
    //clears the stack by calling the pop method until top == -1
    //simultaneously it prints out the values being popped since
    //pop() returns the value being popped from the stack. The
    //stack will be displayed in reverse order
    public void displayClear() {
        while (top != -1) {
            System.out.println(pop());

        }
    }

    public static void main(String[] args) {

        SimpleStack sS = new SimpleStack(10);

        sS.push(1);
        sS.push(2);
        sS.push(3);
        sS.push(4);
        sS.push(5);
        sS.push(6);
        sS.push(7);
        sS.push(8);
        sS.push(9);
        sS.push(10);
        
        sS.displayClear();

    }

}
