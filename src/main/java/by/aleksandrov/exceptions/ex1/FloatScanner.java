package by.aleksandrov.exceptions.ex1;

import java.util.Scanner;

public class FloatScanner {

    private Scanner scanner;

    public FloatScanner() {
        scanner = new Scanner(System.in);
    }

    public float init() {
        System.out.print("Enter number: ");
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        }
        return -1;

    }
}
