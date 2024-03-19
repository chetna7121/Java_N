package java2nd;
//import java.util.*;

import java.util.Scanner;

public class CheckingArrays {
    Scanner scanner = new Scanner(System.in);

    void oneDArray() {
        //array has been initialized with its default values
        //int marks[]= new int[3];
        //assigning values while declaring
        int marks[] = {10, 20, 89};
        //assign values manually
//        marks[0]=89;
//        marks[1]=90;
//        marks[2]=67;
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }

    void twoDArray() {
        int value = 0;
        int marks[][] = new int[1][3];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of student " + value + 1);
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }
        value = 0;
        //is for row
        System.out.println("S.No\tHindi\tEnglish\tMath\tTotal\tGrade");
        for (int i = 0; i < marks.length; i++) {
            value++;
            System.out.print(value);
            for (int j = 0; j < 3; j++) {
                System.out.print("\t\t" + marks[i][j]);
            }
            System.out.println("");
            /*
            Grade 40-60 = Fail
            60-80=C
            80-90=B
            90-100=A
             */
        }
    }
    public static void main(String[] args) {
        CheckingArrays checkingArrays = new CheckingArrays();
        //   checkingArrays.oneDArray();
        checkingArrays.twoDArray();
    }
}
