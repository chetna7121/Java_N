package java1st.scrpack316.innerclasses.streaming;

import java.io.FileInputStream;
public class UsingFileInputStream {
    void readingData() {
        int iData;
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            while ((iData = fileInputStream.read()) != -1) {
                //  System.out.print(iData);
                System.out.print((char) iData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        UsingFileInputStream usingFileInputStream = new UsingFileInputStream();
        usingFileInputStream.readingData();
    }
}
