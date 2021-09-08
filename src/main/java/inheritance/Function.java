package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Function {
    private List<MainLecturer> mainLecturers = new ArrayList<>();
    private List<VisitingLecturer> visitingLecturers = new ArrayList<>();

    public void inputLecturer() { //(1) Nhập vào thông tin của giảng viên
        System.out.println("----------------------------" +
                "\nGiảng viên cơ hữu: 1" +
                "\nGiảng viên thỉnh giảng: 2" +
                "\n----------------------------");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            MainLecturer mainLecturer = new MainLecturer();
            mainLecturer.input();
            this.mainLecturers.add(mainLecturer);
        }

        if (check == 2) {
            VisitingLecturer visitingLecturer = new VisitingLecturer();
            visitingLecturer.input();
            this.visitingLecturers.add(visitingLecturer);

        }
    }

    public void ouputAllLecturer() {//(2) Xuất danh sách toàn bộ giảng viên
        for (int i = 0; i < this.mainLecturers.size(); i++) {
            System.out.println(this.mainLecturers.get(i).toString());
        }
        for (int j = 0; j < this.visitingLecturers.size(); j++) {
            System.out.println(this.visitingLecturers.get(j).toString());
        }
    }

    public void ouputAllMainLecturer() {//(3) Xuất danh sách giảng viên cơ hữu
        for (int i = 0; i < this.mainLecturers.size(); i++) {
            System.out.println(this.mainLecturers.get(i).toString());
        }
    }

    public void ouputAllVisitingLecturer() {//(4) Xuất danh sách giảng viên thỉnh giảng
        for (int i = 0; i < this.visitingLecturers.size(); i++) {
            System.out.println(this.visitingLecturers.get(i).toString());
        }
    }

    public double totalSalaryOfAllLecturer() {//(5) Tính tổng số tiền lương của toàn bộ giảng viên
        double totalSalary = 0;
        for (int i = 0; i < this.mainLecturers.size(); i++) {
            totalSalary += this.mainLecturers.get(i).calTotalSalary();
        }
        for (int i = 0; i < this.visitingLecturers.size(); i++) {
            totalSalary += this.visitingLecturers.get(i).calTotalSalary();
        }
        return totalSalary;
    }

    public double totalSalaryOfAllMainLecturer() {//(5) Tính tổng số tiền lương của giảng viên cơ hữu
        double totalSalary = 0;
        for (int i = 0; i < this.mainLecturers.size(); i++) {
            totalSalary += this.mainLecturers.get(i).calTotalSalary();
        }
        return totalSalary;
    }

    public double totalSalaryOfAllVisitingLecturer() {//(5) Tính tổng số tiền lương của giảng viên thỉnh giảng
        double totalSalary = 0;
        for (int i = 0; i < this.visitingLecturers.size(); i++) {
            totalSalary += this.visitingLecturers.get(i).calTotalSalary();
        }
        return totalSalary;
    }

    public int typeOfLecturerHasSalaryHigher() {//(6) Tìm loại giảng viên có tổng lương cao nhất
        //trả về 1 nếu giáo viên cơ hữu có tổng lương cao hơn, 2 nếu ngược lại, 0 nếu bằng nhau
        if (totalSalaryOfAllMainLecturer() > totalSalaryOfAllVisitingLecturer()) {
            return 1;
        } else if (totalSalaryOfAllMainLecturer() < totalSalaryOfAllVisitingLecturer()) {
            return 2;
        } else {
            return 0;
        }
    }
}



