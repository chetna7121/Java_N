package javacombined319.collectionsorting;

import java.util.Comparator;

public class StudentMarksCompare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        if (student1.getMarks() > student2.getMarks())
            return 1;
        else if (student1.getMarks() < student2.getMarks())
            return -1;
        else
            return 0;
    }
}
