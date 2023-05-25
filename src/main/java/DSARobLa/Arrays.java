package DSARobLa;

public class Arrays {

    private long[] a;
    private int nElems;

    public Arrays(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return this.nElems;
    }

    //find() method uses binary search method to quickly find
    //the index of a desired values stored in the int[] array
    //time complexity is O(log n)
    public int find(long searchKey) {

        int lowerB = 0;
        int upperB = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerB + upperB) / 2;

            if (this.a[curIn] == searchKey) {
                return curIn;
            } else {

                if (this.a[curIn] < searchKey) {
                    lowerB = curIn;
                } else {
                    upperB = curIn;
                }

            }

        }
    }

    // inserts a parameter value into the array based on increasing order
    //time complexity of O(n)
    public void insert(long value) {

        int j;                                      //note this is declared outside for other loops to use

        for (j = 0; j < this.nElems; ++j) {
            if (this.a[j] > value) {                //finds the index where the value to be inserted                       
                break;                              //is less than the value at the specified index
            }                                       //once found j is set to that index and the next
        }                                           //for loop moves all values in the array up one 
        for (int k = this.nElems; k > j; k--) {     //index beginning at index that is one index up 
            this.a[k] = a[k - 1];                   //from the last number stored in the array; k = nElems 
        }                                           //once all the sorted numbers are moved up by one index
        this.a[j] = value;                          //the index [j] will then store the value in the correct position
        this.nElems++;                              //nElems is incremented and the method ends
    }

    public boolean delete(long value){
        int j = find(value);                
        if(j == nElems){
            return false;                           
        }else{
            for(int k = j; k < nElems; k++){        
                a[k] = a[k+1];                  
            }
        }
        nElems--;
        return true;
    }


    @Override
    public String toString() {
        String arrCont = "";

        for (int i = 0; i < this.nElems; ++i) {
            arrCont += this.a[i] + " ";
        }

        return arrCont;
    }
    
    

    public static void main(String[] args) {

        Arrays ordAr = new Arrays(10);
        
        ordAr.insert(12);
        ordAr.insert(1);
        ordAr.insert(5);
        ordAr.insert(22);
        ordAr.insert(7);
        ordAr.insert(13);
        System.out.println(ordAr);
        
        System.out.println(ordAr.find(12));


    }

}
