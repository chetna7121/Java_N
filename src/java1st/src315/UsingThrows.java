package java1st.src315;

import java.sql.*;

public class UsingThrows {
    void connnect() throws SQLClientInfoException {
        System.out.println("connecting to MySQL....");
        //    throw  new SQLClientInfoException();
        //    Integer integer = new Integer(200);
        int val = 10 / 0;
    }

    public static void main(String[] args) {
        UsingThrows usingThrows = new UsingThrows();
        try {
            usingThrows.connnect();
        } catch (SQLClientInfoException e) {
            System.out.println(e);
        }
        //will run each time , whether there is exception or not
        //used - where we are going to close the stream. ex - file handling
        finally {
            System.out.println("this is finally block");
        }
    }
}
