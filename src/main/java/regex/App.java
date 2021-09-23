package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
    /*
   1. Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi văn bản text1
   2.Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text
        Định nghĩa email:
        Bắt đầu bằng chữ cái.
        Chỉ chứa chữ cái, chữ số, dấu gạch ngang -
        Chứa một ký tự @, sau @ là tên miền.
        Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.
    */


public class App {

    public static void main(String[] args) {
        //1.Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy
        String regexDate = "(0?[1-9]|[1-2]\\d{1}|3[0-1])[\\-|\\/](0?[1-9]|1[0-2])[\\-|\\/]\\d{4}";
        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern patternDate = Pattern.compile(regexDate);
        Matcher matcherDate = patternDate.matcher(text1);


        //2.Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text
        String regexEmail = "[A-Za-z]+\\w*@([A-ZA-z]+\\.[A-Za-z]{2,})(\\.[A-Za-z]{2,})?";
        String text = "Hello. I try test email regex with abc122_@gmail.com.vn, " +
                "123@gmail.com, abc@gmail.c" +
                "\nAh, adding, a21_@g.com.";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(text);

        //test1
        System.out.println("Ngày tháng trong chuỗi text1: \n" + text1);
        while (matcherDate.find()) {
            System.out.println("-> " + text1.substring(matcherDate.start(), matcherDate.end()));
        }

        //test2
        System.out.println("==================");
        System.out.println("Email trong chuỗi text: \n" + text);
        while (matcherEmail.find()) {
            System.out.println("-> " + text.substring(matcherEmail.start(), matcherEmail.end()));
        }
    }

}
