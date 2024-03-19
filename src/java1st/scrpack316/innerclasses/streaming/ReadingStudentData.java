package java1st.scrpack316.innerclasses.streaming;

import java1st.scrpack316.innerclasses.streaming.model.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingStudentData {
    void readingStudentData() {
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("student-details.txt"))) {
            Student studentArray[] = new Student[3];
            //Student student = (Student) objectInputStream.readObject();
            studentArray = (Student[]) objectInputStream.readObject();
            System.out.println(studentArray);
            for (Student student:studentArray)
            {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ReadingStudentData readingStudentData = new ReadingStudentData();
        readingStudentData.readingStudentData();
    }
}
