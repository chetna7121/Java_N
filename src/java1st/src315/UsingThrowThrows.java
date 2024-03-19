package java1st.src315;

public class UsingThrowThrows {
    private int pass = 3;

   public void takingCredentials() {
        pass += 1;
        if (pass > 3) {
            throw new RuntimeException("Your password is incorrect 3 times ," +
                    "you are block for the day !");
        }
    }

    public static void main(String[] args) {
        UsingThrowThrows usingThrowThrows = new UsingThrowThrows();
        try {
            usingThrowThrows.takingCredentials();
        } catch (Exception e) {
            System.out.println(e);
            //rethrow
            throw e;
        }
    }
}
