package date;

public class Date {
    /*
    Nhập vào int ngày, int tháng, int năm: phát sinh ra timestamp (giây).
    Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm
     */

    public static final long SENCONDS_OF_DAY = 24 * 3600;
    public static final int ROOT_DAY = 1;
    public static final int ROOT_MONTH = 1;
    public static final int ROOT_YEAR = 1970;

    public static boolean isLeapYear(int year) { //check năm nhuận
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        return false;
    }

    public static int getDateOfMonth(int month, int year) { //tính xem tháng đó có bao nhiêu ngày,
        // nếu nhập tháng không hợp lệ, hàm trả về -1
        int dayOfMonth = -1;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayOfMonth = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayOfMonth = 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                dayOfMonth = 29;
            } else {
                dayOfMonth = 28;
            }
        }
        return dayOfMonth;
    }

    public static boolean isValidOfDate(int day, int month, int year) { //2. check tính hợp lệ
        String strCheck = " -> Date khong hop le!";
        if (getDateOfMonth(month, year) > 0) { //tức là tháng đó hợp lệ và hàm trả ra số ngày của tháng đó
            if (day >= 1 && day <= getDateOfMonth(month, year)) {
                strCheck = " -> Date hop le.";
                return true;
            }
        }
        return false;
    }

    public static long getSecondsFromYear(int year) { //lấy số giây từ 1 năm
        if (isLeapYear(year)) {
            return 366 * SENCONDS_OF_DAY;
        }
        return 365 * SENCONDS_OF_DAY;
    }

    public static long getSecondsFromMonth(int month, int year) {//lấy số giây từ 1 tháng
        return (long) getDateOfMonth(month, year) * SENCONDS_OF_DAY;
    }


    public static long getUnitTimeFromDate(int day, int month, int year) { //lấy timestamp từ ngày, tháng, năm nhập vào, tính tới 0h của ngày nhập vòa đó
        if (!isValidOfDate(day, month, year)) {
            return -1;
        }

        long timestamp = 0;
        if (year < ROOT_YEAR) {
            return -1;
        }
        for (int y = ROOT_YEAR; y < year; y++) {
            timestamp += getSecondsFromYear(y);
        }

        for (int m = 1; m < month; m++) {
            timestamp += getSecondsFromMonth(m, year);
        }

        int countDay = day - 1;
        timestamp += countDay * SENCONDS_OF_DAY;

        return timestamp;
    }


    public static int[] getDateFromUnitTime(long timestamp) { //lấy ngày tháng năm từ đơn vị thời gian nhập vào (giây), tính tới 0h
        int day = ROOT_DAY;
        int month = ROOT_MONTH;
        int year = ROOT_YEAR;

        if (timestamp < 0) {
            return new int[]{-1, -1, -1};
        }

        while (timestamp >= getSecondsFromYear(year)) {
            timestamp -= getSecondsFromYear(year);
            year++;
        }

        while (timestamp >= getSecondsFromMonth(month, year)) {
            timestamp -= getSecondsFromMonth(month, year);
            month++;
        }

        while (timestamp > 0) {
            timestamp -= SENCONDS_OF_DAY;
            day++;
        }

        return new int[]{day, month, year};
    }


    public static void main(String[] args) {
        //test1
        long timestamp = getUnitTimeFromDate(21, 8, 2021);
        System.out.println(timestamp);

        int[] date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2]);
        System.out.println("----------==========------------");

        //test2
        timestamp = getUnitTimeFromDate(31, 12, 2001);
        System.out.println(timestamp);

        date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2]);
        System.out.println("----------==========------------");

        //test3
        timestamp = getUnitTimeFromDate(1, 1, 1970);
        System.out.println(timestamp);

        date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2]);
        System.out.println("----------==========------------");

    }
}
