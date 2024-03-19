package java2nd.src0315.innerclasses;

//outer class
public class RegularInnerClass {
    private String email;
    private String password;
    //inner class
    class ValidatorClass {
        void validate() {
            email = "user12@gmail.com";
            password = "password";
            //we are able to use private members of outer class here
            if (email.equals("user12@gmail.com") && password.equals("password")) {
                System.out.println("You can enjoy the site !!!");
            } else {
                System.out.println("Kindly check your credentials ");
            }
        }
    }

    public static void main(String[] args) {
        //instance of outer class
        RegularInnerClass regularInnerClass = new RegularInnerClass();
        //creating instance of ValidatorClass/inner class using Outer class reference
        //and its object's with new keyword.
        RegularInnerClass.ValidatorClass regValidorClass =
                regularInnerClass.new ValidatorClass();
        regValidorClass.validate();
    }
}
