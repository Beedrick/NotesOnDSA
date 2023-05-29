/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class BubbleSort {

    private int[] a;
    private int nElem;

    public BubbleSort(int max) {
        this.a = new int[max];
        this.nElem = 0;
    }

    //method compares 2 neighbouring values and swaps the tallest
    //of the two to the right and so on until the tallest is placed
    //to the far right and is sorted. Bubble sort has N*(N-1)/2 comparisons
    // on average and N*(N-1)/4 swaps executed. Selection sort will have
    //significantly less swaps meaning it will be a bit quicker than bubble
    //however since constants arent counted in Big O notation it is O(N^2) time complexity
    public void sort() {

        for (int outer = nElem; outer > 1; --outer) {

            for (int inner = 0; (inner + 1) < outer; ++inner) {
                if (this.a[inner] > this.a[inner + 1]) {
                    int temp = this.a[inner];
                    this.a[inner] = this.a[inner + 1];
                    this.a[inner + 1] = temp;

                }
            }
        }

    }

    //inserting values into this.a unsorted
    //time complexity is O(1)
    public void insert(int value) {
        this.a[nElem] = value;
        ++nElem;
    }
    
    @Override
    public String toString(){
        
        String displayAr = "";
        
        for(int i = 0; i < this.nElem; ++i){
            displayAr += this.a[i] + " ";
        }
        
        return displayAr;
    }

    public static void main(String[] args) {

        BubbleSort bS = new BubbleSort(10);

        bS.insert(12);
        bS.insert(5);
        bS.insert(18);
        bS.insert(16);
        bS.insert(15);
        bS.insert(8);
        bS.insert(2);
        bS.insert(9);
        bS.insert(10);
        bS.insert(11);
        
        System.out.println(bS);
        
        bS.sort();
        
        System.out.println(bS);

    }

}
