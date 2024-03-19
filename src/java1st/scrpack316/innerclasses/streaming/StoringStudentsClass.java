package java1st.scrpack316.innerclasses.streaming;

import java1st.scrpack316.innerclasses.streaming.model.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StoringStudentsClass {
    void storingStudentsObjectsIntoFile() {
        Student student1 = new Student("0001", "Rashi", 23);
        Student student2 = new Student("0002", "Sakshi", 22);
        Student student3 = new Student("0003", "Ritu", 21);
        Student studentArray[] = new Student[3];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        for (Student student : studentArray) {
            //here toString() is getting called .
            System.out.println(student);
        }
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(
                             new FileOutputStream("student-details.txt"))) {
            objectOutputStream.writeObject(studentArray);
            //marshalling and unmarshalling
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        StoringStudentsClass storingStudentsClass = new StoringStudentsClass();
        storingStudentsClass.storingStudentsObjectsIntoFile();
    }
}
