package date;

public class DateDetail {
    /*
    Giờ định dạng là 24h
    Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
    Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
     */

    public static final long SENCONDS_OF_HOUR = 60 * 60;
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

    public static boolean isValidOfDate(int day, int month, int year) { //2. check tính hợp lệ của ngày tháng năm
        String strCheck = " -> Date khong hop le!";
        if (getDateOfMonth(month, year) > 0) { //tức là tháng đó hợp lệ và hàm trả ra số ngày của tháng đó
            if (day >= 1 && day <= getDateOfMonth(month, year)) {
                strCheck = " -> Date hop le.";
                return true;
            }
        }
        return false;
    }

    public static boolean isValidOfTime(int hour, int min, int sec) { //2. check tính hợp lệ của giờ phút giây
        String strCheck = " -> Time khong hop le!";
        if ((hour >= 0 && hour <= 23) && (min >= 0 && min <= 59) && (sec >= 0 && sec <= 59)) {
            strCheck = " -> Time hop le.";
            return true;
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


    //lấy timestamp từ ngày, tháng, năm, giờ, phút, giây nhập vào
    public static long getUnitTimeFromDate(int day, int month, int year, int hour, int min, int sec) {
        if (!isValidOfDate(day, month, year) || !isValidOfTime(hour, min, sec) || year < ROOT_YEAR) {
            return -1;
        }

        long timestamp = 0;

        for (int y = ROOT_YEAR; y < year; y++) {
            timestamp += getSecondsFromYear(y);
        }

        for (int m = 1; m < month; m++) {
            timestamp += getSecondsFromMonth(m, year);
        }

        int countDay = day - 1;
        timestamp += countDay * SENCONDS_OF_DAY;

        for (int h = 0; h < hour; h++) {
            timestamp += SENCONDS_OF_HOUR;
        }

        for (int m = 0; m < min; m++) {
            timestamp += 60;
        }

        timestamp += sec;

        return timestamp;
    }


    public static int[] getDateFromUnitTime(long timestamp) { //lấy ngày tháng năm, giờ phút giây từ đơn vị thời gian nhập vào (giây)
        int day = ROOT_DAY;
        int month = ROOT_MONTH;
        int year = ROOT_YEAR;

        int hour = 0;
        int min = 0;
        int sec = 0;

        if (timestamp < 0) { //trả về mảng -1 nếu đầu vào không hợp lệ
            return new int[]{-1, -1, -1, -1, -1, -1};
        }

        while (timestamp >= getSecondsFromYear(year)) {
            timestamp -= getSecondsFromYear(year);
            year++;
        }

        while (timestamp >= getSecondsFromMonth(month, year)) {
            timestamp -= getSecondsFromMonth(month, year);
            month++;
        }

        while (timestamp >= SENCONDS_OF_DAY) {
            timestamp -= SENCONDS_OF_DAY;
            day++;
        }

        while (timestamp >= SENCONDS_OF_HOUR) {
            timestamp -= SENCONDS_OF_HOUR;
            hour++;
        }

        while (timestamp >= 60) {
            timestamp -= 60;
            min++;
        }

        sec += timestamp;

        return new int[]{day, month, year, hour, min, sec};
    }


    public static void main(String[] args) {
        //test1
        long timestamp = getUnitTimeFromDate(21, 8, 2021, 1, 2, 3);
        System.out.println(timestamp);

        int[] date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2] + " " + date[3] + ":" + date[4] + ":" + date[5]);
        System.out.println("----------==========------------");


        //test2
        timestamp = getUnitTimeFromDate(31, 12, 2001, 23, 59, 59);
        System.out.println(timestamp);

        date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2] + " " + date[3] + ":" + date[4] + ":" + date[5]);
        System.out.println("----------==========------------");


        //test3
        timestamp = getUnitTimeFromDate(1, 1, 1970, 0, 0, 0);
        System.out.println(timestamp);

        date = getDateFromUnitTime(timestamp);
        System.out.println(date[0] + "/" + date[1] + "/" + date[2] + " " + date[3] + ":" + date[4] + ":" + date[5]);
        System.out.println("----------==========------------");

    }
}
