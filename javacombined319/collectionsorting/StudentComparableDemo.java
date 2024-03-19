package javacombined319.collectionsorting;

import java.util.*;

public class StudentComparableDemo {
    Student student1 = new Student("Rahul1", 100);
    Student student2 = new Student("Rahul2", 98);
    Student student3 = new Student("Rahul3", 99);
    ArrayList<Student> studentArrayList = new ArrayList<>();

    void setStudentData() {
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
    }
    void iterateStudentData() {
//        ListIterator listIterator = studentArrayList.listIterator();
        System.out.println("List before using compareTo");
        studentArrayList.forEach(p -> System.out.println(p));

        //this will call compareTo method present in Student class
        Collections.sort(studentArrayList);
        System.out.println("List after using compareTo");
        studentArrayList.forEach(p -> System.out.println(p));
    }

    public static void main(String[] args) {
        StudentComparableDemo studentComparableDemo = new StudentComparableDemo();
        studentComparableDemo.setStudentData();
        studentComparableDemo.iterateStudentData();
    }
}
