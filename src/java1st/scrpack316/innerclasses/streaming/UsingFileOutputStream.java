package java1st.scrpack316.innerclasses.streaming;

import java.io.FileOutputStream;

public class UsingFileOutputStream {
    void writingData() {
        String data = "Going to write this data in a file ";
        byte buffer[] = data.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")) {
            for (int i = 0; i < buffer.length; i++) {
                fileOutputStream.write(buffer[i]);
            }
            System.out.println("data has been written into file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        UsingFileOutputStream usingFileOutputStream = new UsingFileOutputStream();
        usingFileOutputStream.writingData();
    }
}
