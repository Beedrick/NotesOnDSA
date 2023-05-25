/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class SelectionSort {

    private int[] a;
    private int nElem;

    public SelectionSort(int max) {
        this.a = new int[max];
        this.nElem = 0;
    }

    //selection sort has the same time complexity as BubbleSort O(n^2)
    //but it has significantly less swaps which is more efficient and faster
    //it has the same number of comparisons as the bubblesort. Typically 
    //methods with nested for loops are O(n^2). Selection sort compares an
    //index that moves right from a sorted index and compares the sorted
    //index with the moving right index for the smallest stored value and swaps them out
    public void sort() {

        for (int inner = 0; inner < nElem; ++inner) {
            int minIndex = inner;
            
            for(int outer = inner + 1; outer < nElem; ++outer){
                if(this.a[minIndex] > this.a[outer]){
                    minIndex = outer;
                }
            }
            
            int temp = this.a[inner];
            this.a[inner] = this.a[minIndex];
            this.a[minIndex] = temp;
            
        }

    }

    //inserting values into this.a unsorted
    //time complexity is O(1)
    public void insert(int value) {
        this.a[nElem] = value;
        ++nElem;
    }

    @Override
    public String toString() {

        String displayAr = "";

        for (int i = 0; i < this.nElem; ++i) {
            displayAr += this.a[i] + " ";
        }

        return displayAr;
    }

    public static void main(String[] args) {

        SelectionSort sS = new SelectionSort(10);

        sS.insert(12);
        sS.insert(5);
        sS.insert(18);
        sS.insert(16);
        sS.insert(15);
        sS.insert(8);
        sS.insert(2);
        sS.insert(9);
        sS.insert(10);
        sS.insert(11);

        System.out.println(sS);

        sS.sort();

        System.out.println(sS);

    }

}
