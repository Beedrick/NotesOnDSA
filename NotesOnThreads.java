package Threads;

//In this code example we have a class which extends Thread
//The main idea of this class is it takes in a shared int array 
//with size 1000 and increments the elements stored in that 
//int array until it is full and it does this by using the 
//run method which calls the book() method.
//The race condition occurs if no synchronization is done.

public class NotesOnThreads extends Thread {

    int id;
    int[] shared_array;
    boolean done = false;
    int booked = 0;

    //In this example we create a 'monitor' object whose sole 
    //job is to act as a lock for the synchronized(){} method
    //there are other ways to synchronize like using this.shared_array
    //as the lock instead. There are also different places you can
    //put the synchronized(){} method so that the race condition
    //problem is solved
    private static Object lock = new Object();

    public NotesOnThreads(int id, int[] shared_array) {
        this.id = id;
        this.shared_array = shared_array;
    }

    public void run() {
        for (int i = 0; i < shared_array.length; i++) {

            //In this example we placed the synchronized method here so that 
            //when each thread calls the run method it will each run into this
            //synchronized() method and the first one will obtain the lock and 
            //block the other threads from entering this segment of code. The
            //segement of code that is synchronized is called the critical section
            synchronized (lock) {

                book();
            }

        }
    }

    //It's important to realize that simply synchronizing this book method
    //i.e public synchronized book(){} will not prevent a race condition.
    //This is because the book() method is not synchronized on the same 'lock'
    //object. Each instance of the NotesOnThreads class has its own lock object
    //i.e 'this'. So if each thread were to call the 'synchronized' book() method
    //the 3 thread will each have its own lock and will not block anyone out of 
    //the shared resource as it executes. Thats why we either create a new shared
    //object or use the existing shared_array object.
    public void book() {

        //It's also possible to place a synchronized(){} method here encapsulating
        //the code within book(). This will also prevent race condition because
        //each thread will call the run() method at the same time, and will all
        //enter the book() method at the same time (assuming there is no synchronized 
        //block there) and once each thread is inside the book method they will run into
        //the synchronized(lock) method.
        
        int i = 0;

        //looking for an empty seat
        for (; i < shared_array.length && shared_array[i] != 0; i++);
        // check the seat available before booking
        if (i < shared_array.length) {
            shared_array[i] = id; //booking
            booked++; //increase number of seats booked
        }
    }

    public static void main(String[] args) {

        int[] seats = new int[1000];

        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0; //empty the booking of a seat
        }

        NotesOnThreads et1 = new NotesOnThreads(1, seats);
        NotesOnThreads et2 = new NotesOnThreads(2, seats);
        NotesOnThreads et3 = new NotesOnThreads(3, seats);

        et1.start();
        et2.start();
        et3.start();

        //waiting for all threads to finish
        while (et1.isAlive() || et2.isAlive() || et3.isAlive());

        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] + " ");

            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println("ET 1 booked: " + et1.booked + " ET 2 booked: " + et2.booked + " ET 3 booked: " + et3.booked + "\nTotal booked: " + (et1.booked + et2.booked + et3.booked));
    }

}
