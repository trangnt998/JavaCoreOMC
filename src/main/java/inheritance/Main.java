package inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("===================================================" +
                "\n(1) Nhập vào thông tin của các giảng viên" +
                "\n(2) Xuất danh sách toàn bộ giảng viên" +
                "\n(3) Xuất danh sách giảng viên cơ hữu" +
                "\n(4) Xuất danh sách giảng viên thỉnh giảng" +
                "\n(5) Tính tổng số tiền lương của toàn bộ giảng viên" +
                "\n(6) Tìm loại giảng viên có tổng lương cao nhất." +
                "\n====================================================");

        System.out.println("Thực hiện chương trình: nhấn Y. \nThoát chương trình: nhấn N.");
        Scanner sc = new Scanner(System.in);
        String confirmation = sc.nextLine();

        Function function = new Function();

        while (confirmation.equals("Y")) {
            System.out.print("Chọn hành động: ");
            int action = sc.nextInt();

            if (action == 1) {
                function.inputLecturer();
            }
            if (action == 2) {
                function.ouputAllLecturer();
            }
            if (action == 3) {
                function.ouputAllMainLecturer();
            }
            if (action == 4) {
                function.ouputAllVisitingLecturer();
            }
            if (action == 5) {
                System.out.println(function.totalSalaryOfAllLecturer());
            }
            if (action == 6) {
                if (function.typeOfLecturerHasSalaryHigher() == 0) {
                    System.out.println("2 loại giảng viên có lương bằng nhau.");
                } else if (function.typeOfLecturerHasSalaryHigher() == 1) {
                    System.out.println("Giảng viên cơ hữu có tổng lương cao nhất.");
                } else {
                    System.out.println("Giảng viên thỉnh giảng có tổng lương cao nhất.");
                }
            }

            System.out.println("Tiếp tục: Y/N?");
            Scanner sc1 = new Scanner(System.in);
            confirmation = sc1.nextLine();
        }


    }
}
