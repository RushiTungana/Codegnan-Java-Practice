package comm.oop.exceptions;


import java.util.*;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class StudentMarks2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] < 0 || marks[i] > 100)
                    throw new InvalidMarksException("Invalid marks! Marks must be between 0 and 100.");

                total += marks[i];
            }

            double percentage = total / 5.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("All marks are valid.");

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}