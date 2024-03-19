public class Class1 {
    void show()
    {
        System.out.println("Hello");
        //primitives and non - primitives
        /* data types
        1)byte
        2)short
        3)int
        4)long
        5)float
        6)double
        7)boolean
        8)char
         */
        int iValue = 0b101; // auto boxing
        //int - primitive
        //iValue = variable
        //0b101 - literal

        Integer iValue1 = 10;
        //Integer - wrapper / object / class
        //iValue1 - variable / object /
        //= -> assignment operator
        //10 -> literal
        System.out.println(iValue);

        //how to name can be -> according to work
        // variable for storing student name->
        /*
        String sName/studentName/s-name
        void getData()/*GetData
        void getDetailsFromClass()
        class ClassForCalculation
        int final GRADE;
        enum ListOfWeek{ MONDAY,TUESDAY}
         */


    } //multiline


    //getter - setter
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.show();
    }
}
