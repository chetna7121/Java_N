package javacombined318;

import java.util.Date;

public class StringFormatTypesExample {
  public static void main(String[] args) throws Exception {
    String str1 = String.format("%d", 2112); // Integer value
    String str2 = String.format("%f", 98.7); // Float value
    String str3 = String.format("%x", 101);  // Hexadecimal value
    String str4 = String.format("%o", 023);  // Octal value
    String str5 = String.format("%tc", new Date()); // Date object
    String str6 = String.format("%c", 'Z');  // Char value
    
    System.out.println(str1); // 2112
    System.out.println(str2); // 98.700000
    System.out.println(str3); // 65
    System.out.println(str4); // 23
    ParseData parseData = new ParseData();
    System.out.println(parseData.parseOwnDate(str5)); // Thu Jan 05 20:52:06 GMT 2023
    System.out.println(str6); // Z
  }
}
