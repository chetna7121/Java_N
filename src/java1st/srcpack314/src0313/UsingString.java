package java1st.src0313;

public class UsingString {
    UsingString()
    {
        System.out.println("Constructor of UsingString");
    }
    void checkStringFunctions() {
        String firstString = "First String";
        char cArray[] = new char[5];
        //length and length()
        //length - property
        System.out.println("check lenght -> " + firstString.length());
        System.out.println("Char of 2 is-> " + firstString.charAt(2));
        firstString.getChars(0, 5, cArray, 0);
        System.out.println(cArray);
        //equals() and ==
        System.out.println(firstString.equals("First String"));
        System.out.println(firstString.substring(0, 5));
        System.out.println(firstString.concat(" again"));
        String name = "Rahul Singh";
//        name.replace("Singh", "Sharma");
        System.out.println(name.replace("Singh", "Sharma"));
       // System.out.println("name after replacing ->" + name);
        System.out.println("name in uppercase is ->" + name.toUpperCase());
        String value = "       Tarun      Singh   ";
        System.out.println("value before trimming ->" + value);
        System.out.println("value after trimming ->" + value.trim());
        char cValue[] = new char[15];
        cValue = value.toCharArray();
        for (char cVal : cValue) {
            System.out.print(cVal);
        }
        System.out.println("RAT".equalsIgnoreCase("rat"));

        //character sequences
        String City ="Jaipur Sikar";
        //sArray - character sequence
        char sArray[]=City.toCharArray();
        for(int i =0;i<City.length();i++)
        {
            System.out.println(sArray[i]);
        }
    }

    public static void main(String[] args) {
        UsingString usingString = new UsingString();
        usingString.checkStringFunctions();
    }
}
