package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    /*
    Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi văn bản text1
     */

    public static void main(String[] args) {
        String regex = "((0|1|2)\\d{1}|(30|31))[\\-\\/]((0)\\d{1}|(10|11|12))[\\/\\-]\\d{4}";
        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }
    }
}
