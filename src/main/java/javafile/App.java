package javafile;

import java.io.*;

public class App {
    /*
     *viết chương trình java ghép nội dung 2 tập tin text sang tập tin khác
     *thông tin của 3 tập tin sẽ được cung cấp bởi user
     */

    public static void main(String[] args) throws IOException {

        //tạo và ghi file
        try {
            FileOutputStream fos1 = new FileOutputStream("data1.txt", true);
            FileOutputStream fos2 = new FileOutputStream("data2.txt", true);
            OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
            OutputStreamWriter osw2 = new OutputStreamWriter(fos2);

            BufferedWriter writer1 = new BufferedWriter(osw1);
            writer1.write("test file 1. AbAB!!!\n");
            writer1.flush();
            writer1.close();

            BufferedWriter writer2 = new BufferedWriter(osw2);
            writer2.write("test file 2. XyXY!!!\n");
            writer2.flush();
            writer2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //ghép nội dung 2 tập tin text sang tập tin khác

        try {
            FileOutputStream fos = new FileOutputStream("test-concat.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter writer = new BufferedWriter(osw);

            FileInputStream fis1 = new FileInputStream("data1.txt");
            InputStreamReader isr1 = new InputStreamReader(fis1);

            FileInputStream fis2 = new FileInputStream("data2.txt");
            InputStreamReader isr2 = new InputStreamReader(fis2);


            BufferedReader reader1 = new BufferedReader(isr1);
            String line1 = reader1.readLine();
            while (line1 != null) {
                writer.write(line1 + "\n");
                line1 = reader1.readLine();
            }


            BufferedReader reader2 = new BufferedReader(isr2);
            String line2 = reader2.readLine();
            while (line2 != null) {
                writer.write(line2 + "\n");
                line2 = reader2.readLine();
            }

            reader1.close();
            reader2.close();
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
