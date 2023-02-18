package varChallenge;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a season and store the input in a variable
        System.out.print("Enter a season of the year: ");
        String season = scanner.next();

        // Prompt the user for a whole number and store the input in a variable
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        // Prompt the user for an adjective and store the input in a variable
        System.out.print("Enter an adjective: ");
        String adjective = scanner.next();

        // Print out the story using the user's inputs
        System.out.println("It was a " + adjective + " " + season + " day. I woke up to the sound of " + number + " birds singing outside my window.");
    }
}
