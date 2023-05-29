/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class StringStack {

    private int max;
    private char[] a;
    private int top;

    public StringStack(int max) {
        this.max = max;
        this.a = new char[max];
        this.top = -1;

    }

    public void push(char value) {
        this.a[++top] = value;
    }

    public char pop() {
        return this.a[top--];
    }

    public char peek() {
        return this.a[top];
    }

    public void displayClear() {
        while (top != -1) {
            System.out.println(pop());

        }
    }
    
    public boolean isEmpty(){
        
        return(this.top == -1);
        
    }

}
