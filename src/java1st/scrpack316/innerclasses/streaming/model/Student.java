package java1st.scrpack316.innerclasses.streaming.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final Long SerialVersionUID = 10L;
    private String enrollmentNumber;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String enrollmentNumber, String name, int age) {
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.age = age;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentNumber='" + enrollmentNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
