package inheritance;

import java.util.Scanner;

public class MainLecturer extends Lecturer {
    private double salary;
    private final int HOURS_STANDARD_OF_MONTH = 40;
    private double salaryBonusPerHour;

    public MainLecturer() {
    }

    public MainLecturer(String name, String email, String address, int phone, float hoursTeachingOfMonth, double salary, double salaryBonusPerHour) {
        super(name, email, address, phone, hoursTeachingOfMonth);
        this.salary = salary;
        this.salaryBonusPerHour = salaryBonusPerHour;
    }

    public void input() { //nhập thông tin giảng viên cơ hữu
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Lương thỏa thuận: ");
        this.salary = sc.nextDouble();
        System.out.print("Lương bonus trên 1 giờ dạy: ");
        this.salaryBonusPerHour = sc.nextDouble();
    }

    public String toString() { //xuất thông tin giảng viên cơ hữu
        return super.toString() +
                "\nLương thỏa thuận: " + this.salary +
                "\nLương bonus trên 1 giờ dạy: " + this.salaryBonusPerHour;
    }

    public double calTotalSalary() { //tính tổng thu nhập của giảng viên
        if (getHoursTeachingOfMonth() < HOURS_STANDARD_OF_MONTH) {
            return this.salary;
        } else {
            return this.salary + salaryBonusPerHour * (getHoursTeachingOfMonth() - HOURS_STANDARD_OF_MONTH);
        }
    }

}
