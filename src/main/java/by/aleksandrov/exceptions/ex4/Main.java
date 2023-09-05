package by.aleksandrov.exceptions.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = sc.nextLine();

        if (userInput == "")
            throw new NullPointerException("Empty string!");
        else {
            System.out.println("You entered " + userInput);
        }
    }
}
