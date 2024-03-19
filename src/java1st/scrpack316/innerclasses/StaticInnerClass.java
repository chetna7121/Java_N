package java1st.scrpack316.innerclasses;
public class StaticInnerClass {
    static private String pin;
    //can use in enterprise app
    static class Validation {
        void validate() {
            pin = "0009";
            if (pin.equals("0009")) {
                System.out.println("pin is correct");
            }
        }
    }
    public static void main(String[] args) {
        StaticInnerClass.Validation validation = new Validation();
        validation.validate();
    }
}
