package java2nd.three1424;

public class UsingString {

    void usingString() {
        String value = "Hello University !";
        System.out.println("length is :" + value.length());
        System.out.println("char on index 3 is :" + value.charAt(3));

        //getChars() -> will store a substring from a string using a beginning index
        //ending index and store those charcters into a char array with beginning index
        //number
        char cArray[] = new char[10];
        value.getChars(6, 16, cArray, 0);
        System.out.println(cArray);
        System.out.println(value.equals("Hello university !"));
        System.out.println("rack".compareTo("Rack")); //32
        System.out.println("Laptop".startsWith("L") + "and" + "Laptop".endsWith("p"));
        System.out.println(value.substring(6, 16));
        System.out.println(value.concat("Today is Thursday "));
        System.out.println("Rahul Sharma".replace("Sharma", "Singh"));
        System.out.println(value.toUpperCase());
        //trim - will remove space from beginning and ending only
        System.out.println("       Omi       Gupta         ".trim());
        //toCharArray - will convert string into a character array.
        cArray = value.toCharArray();
        String name = "Pinky";
        System.out.println(name.toCharArray()[3]);
        System.out.println("Race".equalsIgnoreCase("RACE"));
    }
    public static void main(String[] args) {
        UsingString usingString = new UsingString();
        usingString.usingString();
    }
}
