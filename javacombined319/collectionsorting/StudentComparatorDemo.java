package javacombined319.collectionsorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparatorDemo {
    Student student1 = new Student("Rahul1", 100);
    Student student2 = new Student("Ajit", 98);
    Student student3 = new Student("Zack", 99);
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
        Collections.sort(studentArrayList,new StudentMarksCompare());
        System.out.println("List after using marks comparision");
        studentArrayList.forEach(p -> System.out.println(p));

        Collections.sort(studentArrayList,new StudentNameCompare());
        System.out.println("List after using name comparision");
        studentArrayList.forEach(p -> System.out.println(p));
    }
    public static void main(String[] args) {
        StudentComparatorDemo studentComparatorDemo = new StudentComparatorDemo();
        studentComparatorDemo.setStudentData();
        studentComparatorDemo.iterateStudentData();
    }
}
