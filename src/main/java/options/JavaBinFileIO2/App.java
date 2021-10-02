package options.JavaBinFileIO2;

import java.io.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        //ghi
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello".getBytes());
            bos.write("\n".getBytes());
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read 1 byte
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int ch;
            ch = bis.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bis.read();
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Order order = new Order(LocalDate.now(), "Trang", 500);
        //ghi
        try {
            FileOutputStream fos = new FileOutputStream("order.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(order.getCustomer());
            dos.writeUTF(order.getDate().toString());
            dos.writeDouble(order.getTotal());

            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc
        try {
            FileInputStream fis = new FileInputStream("order.bin");
            DataInputStream dis = new DataInputStream(fis);
            String name = dis.readUTF();
            String date = dis.readUTF();
            double total = dis.readDouble();

            LocalDate localDate = LocalDate.parse(date);
            Order order1 = new Order(localDate, name, total);
            System.out.println(order1);
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //ghi và đọc 1 danh sách order
        Order[] orders = new Order[]{
                new Order(LocalDate.now(), "Khach 1", 5001),
                new Order(LocalDate.now(), "Khach 2", 5002),
                new Order(LocalDate.now(), "Khach 3", 5003),
                new Order(LocalDate.now(), "Khach 4", 5004),
                new Order(LocalDate.now(), "Khach 5", 5005),
                new Order(LocalDate.now(), "Khach 6", 5006),
        };

        //ghi
        try {
            FileOutputStream fos = new FileOutputStream("orders.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            for (Order order1 : orders) {
                dos.writeUTF(order1.getCustomer());
                dos.writeUTF(order1.getDate().toString());
                dos.writeDouble(order1.getTotal());
            }
            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc
        try {
            FileInputStream fis = new FileInputStream("orders.bin");
            DataInputStream dis = new DataInputStream(fis);
            while (dis.available() > 0) {
                String name = dis.readUTF();
                String date = dis.readUTF();

                LocalDate localDate = LocalDate.parse(date);
                double total = dis.readDouble();

                Order order1 = new Order(localDate, name, total);
                System.out.println(order1);
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Person person = new Person("Trang", 23);
        //ghi
        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc
        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
