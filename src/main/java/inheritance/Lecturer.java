package inheritance;

import java.util.Scanner;

public class Lecturer {
    private String name;
    private String email;
    private String address;
    private int phone;
    private float hoursTeachingOfMonth;

    public Lecturer() {
    }

    public Lecturer(String name, String email, String address, int phone, float hoursTeachingOfMonth) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.hoursTeachingOfMonth = hoursTeachingOfMonth;
    }

    public float getHoursTeachingOfMonth() {
        return hoursTeachingOfMonth;
    }

    public void input() { //nhập thông tin giảng viên
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        this.name = sc.nextLine();
        System.out.print("Email: ");
        this.email = sc.nextLine();
        System.out.print("Địa chỉ: ");
        this.address = sc.nextLine();
        System.out.print("SĐT: ");
        this.phone = sc.nextInt();
        System.out.print("Số giờ giảng dạy trong tháng: ");
        this.hoursTeachingOfMonth = sc.nextFloat();
    }

    public String toString() { //xuất thông tin giảng viên
        return "\nHọ tên: " + this.name +
                "\nEmail: " + this.email +
                "\nĐịa chỉ: " + this.address +
                "\nSĐT: " + this.phone +
                "\nSố giờ giảng dạy trong tháng: " + this.hoursTeachingOfMonth;
    }

    public double calTotalSalary() { //tính tổng thu nhập của mỗi giảng viên
        return 0;
    }
}
