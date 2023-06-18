/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class Node {
    
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
    
    public void displayNode(){
        System.out.println(this.data);
    }
    
}
