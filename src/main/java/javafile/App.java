package javafile;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
/*
        try {
            FileInputStream fileInputStream = new FileInputStream("target/data.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/

        //viết chương trình java ghép nội dung 2 tập tin text sang tập tin khác
        //thông tin của 3 tập tin sẽ được cung cấp bởi user


        try {
            FileWriter fileWriter = new FileWriter("target/test.txt");
            FileInputStream fileInputStream1 = new FileInputStream("target/test1.txt");
            FileInputStream fileInputStream2 = new FileInputStream("target/test2.txt");

            Scanner scanner1 = new Scanner(fileInputStream1);
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                fileWriter.write(line);
            }

            Scanner scanner2 = new Scanner(fileInputStream2);
            fileWriter.write("\n");
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                fileWriter.write(line);
            }

            fileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
