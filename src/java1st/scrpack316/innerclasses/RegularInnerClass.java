package java1st.scrpack316.innerclasses;

public class RegularInnerClass {
    private String email;
    private String password;
    class ValidationClass {
        void validate() {
            email = "user@gmail.com";
            password = "password";
            if (email.equals("user@gmail.com") && password.equals("password")) {
                System.out.println("You can enjoy the site !!!");
            } else {
                System.out.println("Credentials invalid !!!");
            }
        }
    }

    public static void main(String[] args) {
        RegularInnerClass regularInnerClass =
                new RegularInnerClass();
        RegularInnerClass.ValidationClass validationClass =
                regularInnerClass.new ValidationClass();
        validationClass.validate();
    }
}
