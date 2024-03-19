package java1st.src315;

import java1st.src315.customexception.AgeException;

import java.util.Scanner;

public class ValidateAge {
    Scanner scanner = new Scanner(System.in);

    void takingInput() {
        int age;
        System.out.println("Enter your age");
        age = scanner.nextInt();
        if (age <= 0) {
            try {
                throw new AgeException("You are not born yet !");
            } catch (AgeException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("entered age is " + age);
        }
        assert ((age>0)&&(age<=18));
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        ValidateAge validateAge = new ValidateAge();
        validateAge.takingInput();
    }
}
