/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class DoubleNode {
    
    public DoubleNode previous;
    public DoubleNode next;
    int data;
    
    public DoubleNode(int data){
        this.data = data;
    }
    
    public void display(){
        System.out.println(this.data + " ");
    }
    
}
