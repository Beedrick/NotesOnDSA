/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class BinarySearchRecursive {

    private int[] array;
    private int nElems;

    public BinarySearchRecursive(int[] array) {

        this.array = array;
        nElems = array.length;

    }

    public int recFind(int key, int lower, int upper) {

        int currIn = (lower + upper) / 2;

        if (key == array[currIn]) {
            return currIn;
        } else if (lower > upper) {
            return nElems;
        } else {
            if (array[currIn] < key) {
                return recFind(key, currIn + 1, upper);
            } else {
                return recFind(key, currIn + 1, lower);
            }
        }

    }
    
    public int find(int key){
        return (recFind(key, 0, this.nElems - 1));
    }

}
