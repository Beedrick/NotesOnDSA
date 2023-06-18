/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class TriangleRecursion {
    
    public TriangleRecursion(){
        
    }
    
    public int triangle(int numColumn){
        if(numColumn == 1){
            return numColumn;
        }
        
        return(numColumn + triangle(numColumn - 1));
        
    }
    
    public int factorial(int factNum){
        
        if(factNum == 0){
            return 1;
        }
        
        return(factNum * factorial(factNum - 1));
        
    }
    
    
    public static void main(String[] args) {
        TriangleRecursion tR = new TriangleRecursion();
        
        System.out.println(tR.triangle(1000));
        
        System.out.println(tR.factorial(5));
        
    }
   
    
}
