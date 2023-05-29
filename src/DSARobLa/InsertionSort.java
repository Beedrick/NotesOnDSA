/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSARobLa;

/**
 *
 * @author Gorilla Rig
 */
public class InsertionSort {

    private int[] a;
    private int nElem;

    public InsertionSort(int max) {
        this.a = new int[max];
        this.nElem = 0;
    }

    //insertion sort is still time complexity O(n^2) but is significantly 
    //quicker than bubble sort and somewhat faster than the selection sort
    //in normal situations
    public void sort() {

        for (int curIndex = 1; curIndex < nElem; ++curIndex) {
            int left;
            int temp = this.a[curIndex];

            for (left = curIndex; left > 0; left--) {       //my method for sort has a for loop that iterates for the entire 
                                                            //loop until left is == 0. Compare this to the sort method from the
                if (temp < this.a[left - 1]) {              //book where it is a while loop and a condition must be met. in the case
                    this.a[left] = this.a[left - 1];        //that the array is fully sorted my method will run at O(n^2) still because 
                    this.a[left - 1] = temp;                //the for loop will run regardless of if the left most unsorted value is larger 
                }                                           //than the value to the left of itself
            }

        }

    }

    public void sortFromBook() {
        int in, out;

        for (out = 1; out < this.nElem; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {       //this while loop condition prevents the loop from running if 
                a[in] = a[in - 1];                      //the temp value is greater than the value to the left of itself
                --in;                                   // in other words if it is already sorted the loop wont run compared
            }                                           //to my method this is much more efficient for arrays close to completely
            a[in] = (int) temp;                         //sorted and the number of elements are large run the main method and compare the two methods
        }                                               //also look at the method and see that it is actually a swap for loop with a nested while loop 
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

        InsertionSort iS = new InsertionSort(10);
        InsertionSort iS2 = new InsertionSort(10);

        /* iS.insert(12);
        iS.insert(5);
        iS.insert(18);
        iS.insert(16);
        iS.insert(15);
        iS.insert(8);
        iS.insert(2);
        iS.insert(9);
        iS.insert(10);
        iS.insert(11);*/
        
        iS.insert(1);
        iS.insert(2);
        iS.insert(3);
        iS.insert(4);
        iS.insert(5);
        iS.insert(6);
        iS.insert(7);
        iS.insert(10);
        iS.insert(11);
        iS.insert(15);

        iS2.insert(1);
        iS2.insert(2);
        iS2.insert(3);
        iS2.insert(4);
        iS2.insert(5);
        iS2.insert(6);
        iS2.insert(7);
        iS2.insert(10);
        iS2.insert(11);
        iS2.insert(15);

        System.out.println(iS);
        System.out.println(iS2);

        iS.sort();
        iS2.sortFromBook();

        System.out.println(iS);
        System.out.println(iS2);

    }

}
