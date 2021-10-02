package JavaBinFileIO;

import java.io.*;

public class App {
    // copy tập tin bất kì sang tập tin khác, đọc nguồn ghi đích, không dùng copy có sẵn
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("dataTest.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("dataCopy.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int ch;
            ch = bis.read();
            while (ch != -1) {
                bos.write(ch);
                ch = bis.read();
            }

            bos.flush();
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
