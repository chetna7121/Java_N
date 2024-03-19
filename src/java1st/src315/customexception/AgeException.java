package java1st.src315.customexception;

//custom exception
public class AgeException extends RuntimeException {
   public AgeException() {
        System.out.println("Invalid age for casting vote");
    }
   public AgeException(String msg) {
        super(msg);
    }
}
