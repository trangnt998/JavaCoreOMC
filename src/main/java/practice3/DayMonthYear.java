package practice3;

import java.util.Scanner;

public class DayMonthYear {
    /*  1. Viết chương trình xét 1 năm có phải năm nhuận hay không?
        2.Cho ngày, tháng, năm – day, month, year, yêu cầu:
            a. Xét xem ngày, tháng, năm này có hợp lệ hay không?
                21/3/2021 🡪 hợp lệ.
                29/2/2021 🡪 không hợp lệ.
                29/2/2020 🡪 hợp lệ.
                30/12/2019 🡪 hợp lệ.
            b. Tính toán ngày sau đó 1 ngày.
            c. Tính toán ngày trước đó 1 ngày.
        8. Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày. (practice2)
    */

    public static boolean checkLeapYear(int year) { //check năm nhuận
        boolean check = false;
        if (year % 400 == 0) {
            check = true;
        } else {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                check = true;
            }
        }
        return check;
    }

    public static int dateOfMonth(int month, int year) { //tính xem tháng đó có bao nhiêu ngày,
        // đảm bảo 1 năm chỉ có 12 tháng nếu hàm trả về số khác 0
        int dayOfMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayOfMonth = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayOfMonth = 30;
        }
        if (month == 2) {
            if (checkLeapYear(year)) {
                dayOfMonth = 29;
            } else {
                dayOfMonth = 28;
            }
        }
        return dayOfMonth;
    }

    public static String checkValidOfDate(int day, int month, int year) { //2. check tính hợp lệ
        String strCheck = " -> Khong hop le!";
        if (dateOfMonth(month, year) != 0) { //tức là tháng đó hợp lệ và hàm trả ra số ngày của tháng đó
            if (day >= 1 && day <= dateOfMonth(month, year)) {
                strCheck = " -> Hop le.";
            }
        }
        return strCheck;
    }

    public static int[] nextDay(int day, int month, int year) { //Tính toán ngày sau đó 1 ngày.
        if (checkValidOfDate(day, month, year).equals(" -> Hop le.")) {
            if (day < dateOfMonth(month, year)) {//ngày hiện tại nếu thêm 1 ngày vẫn chưa sang tháng mới
                day += 1;
            } else {
                day = 1;
                if (month < 12) {
                    month += 1;
                } else {//tháng hiện là tháng 12 và nếu thêm 1 ngày thì sang năm mới
                    month = 1;
                    year += 1;
                }
            }
            return new int[]{day, month, year};
        } else {//ngay khong hop le
            return new int[]{};
        }

    }

    public static int[] previousDay(int day, int month, int year) {//Tính toán ngày trước đó 1 ngày.
        if (checkValidOfDate(day, month, year).equals(" -> Hop le.")) {
            if (day > 1) {//ngày hiện tại nếu giảm 1 ngày vẫn chưa về tháng cũ
                day -= 1;
            } else {
                if (month > 1) { //trả về tháng trước đó
                    day = dateOfMonth(month - 1, year); //trả về ngày cuối của tháng trước đó
                    month -= 1;
                } else {//tháng hiện là tháng 1 và nếu giảm 1 ngày thì quay về năm cũ
                    month = 12;
                    year -= 1;
                    day = dateOfMonth(month, year); //trả về ngày cuối của tháng trước đó

                }
            }
            return new int[]{day, month, year};
        } else {//ngay khong hop le
            return new int[]{};
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1. Viết chương trình xét 1 năm có phải năm nhuận hay không?
        System.out.print("1. Nhap year de kiem tra nam nhuan: ");
        int year = in.nextInt();

        String check = "Nam khong nhuan!";
        if (checkLeapYear(year)) {
            check = "Nam nhuan.";
        }
        System.out.println(check);

        //8. Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày. (practice2)
        System.out.print("====================================\n8. Nhap thang va nam: ");
        int month = in.nextInt();
        year = in.nextInt();

        if (month >= 1 && month <= 12) {
            int ddmm = dateOfMonth(month, year);
            System.out.println("Thang vua nhap co: " + ddmm + " ngay");
        } else {
            System.out.println("Thang khong dung!");
        }

        //2.Cho ngày, tháng, năm – day, month, year, yêu cầu:....

        System.out.println("2. ========================");
        String check1 = checkValidOfDate(21, 3, 2021);
        String check2 = checkValidOfDate(29, 2, 2021);
        String check3 = checkValidOfDate(29, 2, 2020);
        String check4 = checkValidOfDate(30, 12, 2019);

        System.out.println("21/3/2021" + check1 + "\n"
                + "29/2/2021" + check2 + "\n"
                + "29/2/2020" + check3 + "\n"
                + "30/12/2019" + check4 + "\n");

        int[] theNextDay = nextDay(31, 12, 2001);
        if (theNextDay.length != 0) {
            System.out.println(theNextDay[0] + "/" + theNextDay[1] + "/" + theNextDay[2]);
        } else {
            System.out.println("Khong ton tai ngay nay!");
        }


        int[] thePreviousDay = previousDay(1, 1, 2021);
        if (thePreviousDay.length != 0) {
            System.out.println(thePreviousDay[0] + "/" + thePreviousDay[1] + "/" + thePreviousDay[2]);
        } else {
            System.out.println("Khong ton tai ngay nay!");
        }
    }
}
