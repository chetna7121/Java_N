package javacombined318;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class ParseData {
    public String parseOwnDate(String date) throws Exception {
        DateFormat formatter =
                new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        DateFormat formatter1 =
                new SimpleDateFormat("dd.MM.yyyy");
        String returnDate = formatter1.format(formatter.parse(date));

//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate = LocalDate.parse(date, formatter);
//        String returnDate = formatter.format(localDate);
        return returnDate;
    }

    public void parseDate() throws Exception {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String date = "14:10:2020";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("parsed local date: " + localDate);
        System.out.println("formatted local date: " +
                formatter.format(localDate));
    }

    void parseWrapper() {

        //downcasting - boxing
        int value = Integer.parseInt("200");
        System.out.println(value + 90);
    }

    //Period is class in Java which is from java.time
    void usingPeriod() {
        //Here is the age String in format to  parse
        String age = "P17Y9M5D";
        // Converting strings into period value
        // using parse() method
        Period p = Period.parse(age);
        System.out.println("the age is: ");
        System.out.println(p.getYears() + " Years\n"
                + p.getMonths() + " Months\n"
                + p.getDays() + " Days\n");
    }

    public static void main(String[] args) throws Exception {
        ParseData parseData = new ParseData();
        //     parseData.usingPeriod();
        parseData.parseDate();
    }
}
