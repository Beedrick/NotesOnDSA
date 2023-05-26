/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EasyLeetProblems;

/**
 *
 * @author Gorilla Rig
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        StringBuilder nums = new StringBuilder();

        String numX = String.valueOf(x);

        nums.append(numX);

        nums.reverse();

        if (numX.equals(nums.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isPalin(int x) {
        
       int number = x;
       int reverse = 0;
       
       while(x!= 0){
           int remainder = x % 10;
           reverse = reverse * 10 + remainder;
           x = x/10;
       }
        
        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        PalindromeNumber pN = new PalindromeNumber();

        boolean isPal = pN.isPalin(-121);
        System.out.println(isPal);
    }

}
