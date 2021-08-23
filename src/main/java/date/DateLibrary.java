package date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

//Sử dụng thư viện date và time để thực hiện
/*
    Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
    Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
 */

public class DateLibrary {
    public static void main(String[] args) {
        LocalDateTime rootDate = LocalDateTime.of(1970, 1, 1, 0, 0, 0);


        //Test1
        LocalDateTime date = LocalDateTime.of(2021, 8, 21, 1, 2, 3);
        long timestamp = Duration.between(rootDate, date).getSeconds();
        System.out.println(timestamp);

        date = rootDate.plusSeconds(timestamp);
        System.out.println(date);
        System.out.println("----------==========------------");


        //Test2
        date = LocalDateTime.of(2001, 12, 31, 23, 59, 59);
        timestamp = Duration.between(rootDate, date).getSeconds();
        System.out.println(timestamp);

        date = rootDate.plusSeconds(timestamp);
        System.out.println(date);
        System.out.println("----------==========------------");

        //Test3
        date = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
        timestamp = Duration.between(rootDate, date).getSeconds();
        System.out.println(timestamp);

        date = rootDate.plusSeconds(timestamp);
        System.out.println(date);
        System.out.println("----------==========------------");


    }
}
