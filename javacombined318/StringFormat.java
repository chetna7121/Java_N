package javacombined318;

import java.util.Locale;

public class StringFormat {
    void formatString(){
        String name="Rahul Singh";
        System.out.println(String.format("User name is %s",name));
        System.out.format(
                Locale.FRANCE,
                "The value of the float " + "variable is %f  ",
                10.3242342
        ); // The value of the float variable is 10.324234.

    }

    public static void main(String[] args) {
        StringFormat stringFormat = new StringFormat();
        stringFormat.formatString();
    }
}
