/*
* This program generates marks
* after reading in 2 text files.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-28
*/

import java.util.Scanner;

/**
* This is the marks program.
*/
final class Reverse {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Reverses an inputted string.
    *
    * @param text this is the inputted text
    * @return returns
    */
    public static String reverse(final String text) {

        final String returnValue;

        if (text.length() == 0) {
            returnValue = text;
        } else {

            returnValue = reverse(text.substring(1)) + (text.charAt(0));
        }
        return returnValue;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObjOne = new Scanner(System.in);
        System.out.println("Please enter some string to be reversed: ");
        final String text = myObjOne.nextLine();

        final String reversedText = reverse(text);

        System.out.println(reversedText);

        System.out.println("\nDone.");
    }
}
