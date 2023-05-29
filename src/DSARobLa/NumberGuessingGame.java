package DSARobLa;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int lowerB = 0;
        int upperB = 101;

        //simple computer guesser that guesses your number between 0 - 100
        //Think of a number between 0-100 and the computer will try to guess
        // computer will take their first guess and ask you if their guess
        //was higher, lower, or exactly equal to your number. The computer
        //will always guess your number in 7 guesses or lower!
        do {

            int currIn = (lowerB + upperB) / 2;
            System.out.println("Is " + currIn + " higher, lower or exactly your number? (h/l/e)");
            String userIn = scanf.nextLine();

            if (userIn.equalsIgnoreCase("e")) {
                System.out.println("Your number is " + currIn + "!");
                break;
            } else if (userIn.equalsIgnoreCase("h")) {

                lowerB = currIn;

            } else if (userIn.equalsIgnoreCase("l")) {
                upperB = currIn;
            } else if (lowerB > upperB) {
                System.out.println("Sorry your number isnt between 0 and 100");
                break;
            }

        } while (true);

    }

}
