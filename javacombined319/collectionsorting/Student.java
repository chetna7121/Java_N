package javacombined319.collectionsorting;

//single sort -
// it compares object references
public class Student  implements  Comparable{
private String name;
private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {

        this.marks = marks;
    }

    @Override
    public int compareTo(Object o) {
        Student student =(Student)o;
        if(this.marks>student.marks)
            return  1;
        else if(this.marks< student.marks)
            return -1;
        else
            return  0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
