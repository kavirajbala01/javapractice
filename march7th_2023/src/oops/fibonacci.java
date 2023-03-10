package oops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();
        input.close();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci series up to " + numTerms + " terms:");

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

