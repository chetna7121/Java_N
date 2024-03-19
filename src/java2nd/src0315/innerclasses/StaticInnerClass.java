package java2nd.src0315.innerclasses;

import java.util.Scanner;

public class StaticInnerClass {
    private static String pin ;
    static Scanner scanner = new Scanner(System.in);
    static class ValidateCreditCardDetails{
    void checkCredentials()
    {
        System.out.println("Enter pin ");
        pin = scanner.next();
        if(pin.equals("0999"))
        {
            System.out.println("Validation done !");
        }
    }
    }
    static class ValidateDebitCardDetails{
        void checkCredentials()
        {
            System.out.println("Enter pin ");
            pin = scanner.next();
            if(pin=="0999")
            {
                System.out.println("Validation done !");
            }
        }
    }
    static class ValidateNetDetails{
        void checkCredentials()
        {
            System.out.println("Enter pin ");
            pin = scanner.next();
            if(pin=="0999")
            {
                System.out.println("Validation done !");
            }
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.ValidateCreditCardDetails validateCreditCardDetails=
                new StaticInnerClass.ValidateCreditCardDetails();
        validateCreditCardDetails.checkCredentials();

    }
}
