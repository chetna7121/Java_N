package java1st.scrpack316.innerclasses;
//outer class
public class MethodLocalInnerClass {
    //outer class's method
    void validate()
    {
        //method local inner class
        class MethodLocalValidation{
            //inner class's method
            void innerValidate()
            {
                System.out.println("its inner validation");
            }
        }
        //creating inner class object and calling its members
        MethodLocalValidation methodLocalValidation = new MethodLocalValidation();
        methodLocalValidation.innerValidate();
    }
    public static void main(String[] args) {
        MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
        methodLocalInnerClass.validate();
    }

}
