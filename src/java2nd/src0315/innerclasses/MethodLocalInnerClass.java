package java2nd.src0315.innerclasses;

public class MethodLocalInnerClass {
    private String checkData;
    void checkingData(){
        class ValidatingData
        {
            void check()
            {
                System.out.println("Checking works in method local inner class");
            }
        }
        ValidatingData validatingData = new ValidatingData();
        validatingData.check();
    }
    public static void main(String[] args) {
        MethodLocalInnerClass methodLocalInnerClass =
                new MethodLocalInnerClass();
        methodLocalInnerClass.checkingData();
    }
}
