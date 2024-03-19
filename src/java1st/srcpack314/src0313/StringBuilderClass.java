package java1st.src0313;

import java.util.Scanner;

public class StringBuilderClass {
    StringBuilder stringBuilder = new StringBuilder();

    void takingInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.next();
        stringBuilder.append(name);
        System.out.println(stringBuilder.append(" Welcome to Java !"));
        System.out.println(stringBuilder.reverse());
    }

    void checkStringBuilderFunctions() {
        System.out.println(stringBuilder);
        stringBuilder.append(" adding more");
        System.out.println(stringBuilder);
        stringBuilder.delete(11, 23);
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        StringBuilderClass stringBuilderClass = new StringBuilderClass();
        // stringBuilderClass.checkStringBuilderFunctions();
        stringBuilderClass.takingInputFromUser();
    }
}
