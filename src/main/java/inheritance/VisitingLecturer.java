package inheritance;

import java.util.Scanner;

public class VisitingLecturer extends Lecturer {
    private String workingAgency;
    private final int PRICE_OF_HOUR = 200000;

    public VisitingLecturer() {
    }

    public VisitingLecturer(String name, String email, String address, int phone, float hoursTeachingOfMonth, String workingAgency) {
        super(name, email, address, phone, hoursTeachingOfMonth);
        this.workingAgency = workingAgency;
    }

    public void input() { //nhập thông tin giảng viên thỉnh giảng
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Cơ quan làm việc: ");
        this.workingAgency = sc.nextLine();
    }

    public String toString() { //xuất thông tin giảng viên thỉnh giảng
        return super.toString() +
                "\nCơ quan làm việc: " + this.workingAgency;
    }

    public double calTotalSalary() { //tính tổng thu nhập của giảng viên
        return (double) this.getHoursTeachingOfMonth() * PRICE_OF_HOUR;
    }

}
