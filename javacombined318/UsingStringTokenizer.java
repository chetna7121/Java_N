package javacombined318;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.StringTokenizer;

public class UsingStringTokenizer {
    void usingCommaDelimiter() {
        String myString = "The java.util package has a class called StringTokenizer,that is used to tokenize strings.";
        StringTokenizer st = new StringTokenizer(myString, ",");
        int numberOfTokens;
        numberOfTokens = st.countTokens();
        System.out.println("Number of tokens in the string: " + numberOfTokens);
        while (st.hasMoreTokens()) {
            System.out.println("The next token is " + st.nextToken());
        }
    }

    void usingDefaultDelimiter() {
        StringTokenizer st = new StringTokenizer("String tokenizer is part of java.util");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    void readingCSV() {
        try {
            // csv file containing data
            String strFile = "data.csv";
            // create BufferedReader to read csv file
            BufferedReader br = new BufferedReader(new FileReader(strFile));
            String strLine = "";
            StringTokenizer st = null;
            int lineNumber = 0, tokenNumber = 0;
            strLine = br.readLine();
            // read comma separated file line by line
            while (strLine != null) {
                lineNumber += 1;
                // break comma separated line using ","
                st = new StringTokenizer(strLine, ",");
                while (st.hasMoreTokens()) {
                    // display csv values
                    tokenNumber++;
                    System.out.println("Line # " + lineNumber +
                            ", Token # " + tokenNumber
                            + ", Token : " + st.nextToken());
                }
                // reset token number
                tokenNumber = 0;
                strLine = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Exception while reading csv file: " + e);
        }
    }

    public static void main(String[] args) {
//        UsingStringTokenizer usingStringTokenizer = new UsingStringTokenizer();
//        usingStringTokenizer.readingCSV();
        Random random = new Random();
        random.nextInt(1,100);
        int val=65;
        for (int i = 0; i < 10; i++) {
            System.out.println(((char)++val)+""+
                    random.nextInt(1, 100));
        }
    }
}
