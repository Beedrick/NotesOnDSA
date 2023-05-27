/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EasyLeetProblems;

/**
 *
 * @author Gorilla Rig
 */
public class RomanNums {

    public int romanToInt(String s) {

        int numOfRom = 0;

        String four = "IV";
        String nine = "IX";
        String fourty = "XL";
        String ninety = "XC";
        String fourHun = "CD";
        String nineHun = "CM";

        if (s.contains(four)) {
            numOfRom += 4;
            s = s.replace(four, "");
        }
        if (s.contains(nine)) {
            numOfRom += 9;
            s = s.replace(nine, "");
        }
        if (s.contains(fourty)) {
            numOfRom += 40;
            s = s.replace(fourty, "");
        }
        if (s.contains(ninety)) {
            numOfRom += 90;
            s = s.replace(ninety, "");
        }
        if (s.contains(fourHun)) {
            numOfRom += 400;
            s = s.replace(fourHun, "");
        }
        if (s.contains(nineHun)) {
            numOfRom += 900;
            s = s.replace(nineHun, "");
        }

        for (int i = 0; i < s.length(); ++i) {

            switch (s.charAt(i)) {
                case 'I':
                    numOfRom += 1;
                    break;
                case 'V':
                    numOfRom += 5;
                    break;
                case 'X':
                    numOfRom += 10;
                    break;
                case 'L':
                    numOfRom += 50;
                    break;
                case 'C':
                    numOfRom += 100;
                    break;
                case 'D':
                    numOfRom += 500;
                    break;
                case 'M':
                    numOfRom += 1000;
                    break;
            }

        }

        return numOfRom;

    }

    public static void main(String[] args) {
        RomanNums rN = new RomanNums();

        String s = "MCMXCIV";

        System.out.println(rN.romanToInt(s));
    }

}
