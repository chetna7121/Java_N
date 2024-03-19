package java1st.srcpack314.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TakingTwoNumbers {
    Scanner scanner = new Scanner(System.in);

    void takingTwoNumber() {

        int result = 0;
        try {
            int val = 10 / 0;
            System.out.println("You need to enter two numbers \n enter number 1 ");
            int num1 = scanner.nextInt();
            System.out.println("\nenter number 2 ");
            int num2 = scanner.nextInt();
            result = num1 + num2;
            System.out.println("result is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number " + e);
        } catch (Exception e) {
            System.out.println("other exception " + e);
        }
    }

    public static void main(String[] args) {
        TakingTwoNumbers takingTwoNumbers = new TakingTwoNumbers();
        //try {
        takingTwoNumbers.takingTwoNumber();
        //} catch (Exception e) {
        //     System.out.println("enter a valid number");
        //}
    }
}
