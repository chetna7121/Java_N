package java1st.srcpack312;

public class UsingArrays {
    void oneDArray() {
        int science = 90, math = 80, english = 70;
        System.out.println(science);
        int[] marks = new int[3];
        String names[] = new String[3];
//        marks[0]=100;
//        marks[1]=45;
//        marks[2]=10;
        int mark = 80;
        for (int i = 0; i < 3; i++) {
            marks[i] = mark + 10;
        }
        System.out.println("Marks are:\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        // System.out.println(marks[0]+"\t"+names[0]);
    }

    public static void main(String[] args) {
        UsingArrays ua = new UsingArrays();
        ua.oneDArray();
    }
}
