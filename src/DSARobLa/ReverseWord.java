/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class ReverseWord {

    private String input;
    private String output;
    
    public ReverseWord(String in){
        
        this.input = in;
        
    }
    
    public void setInput(String input){
        this.input = input;
    }
    
    
    //reverser method demonstrates some uses for Stack datastructure
    //push method stacks the characters of the input String on top of 
    //each other while the pop method removes all characters starting 
    //from the top of the stack to the bottom while adding char to output String
    public String reverser(){
        
        this.output = "";
        StringStack stackX = new StringStack(input.length());
        
        
        for(int index = 0; index < this.input.length(); ++index){
            stackX.push(input.charAt(index));
        }
        
        while(!stackX.isEmpty()){
            this.output += stackX.pop();
        }
        
        return this.output;
    }
    
    
    public static void main(String[] args) {
        
        String input = "hello";
        
        ReverseWord rW = new ReverseWord(input);
        
        System.out.println(rW.reverser());
        
        input = "reverse";
        rW.setInput(input);
        
        System.out.println(rW.reverser());
        
        
    }
    
}
