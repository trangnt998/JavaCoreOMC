package practice_string;

import java.util.Scanner;

public class PracticeString {
    public static String printUppercase(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result += c;
            }
        }
        return result.toString();
    }

    public static String printNonNumeric(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isDigit(c)) {
                continue;
            }
            result += c;
        }
        return result;
    }


    public static int occurChar(String s, char c) {
        int count = 0;
        char c1;
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            if (c1 == c) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Nhap chuoi:");
        System.out.println(printUppercase(s));

        System.out.println(printNonNumeric(s));

        String str = sc.nextLine();
        char c = str.charAt(0);
        System.out.println("Nhap ki tu c:");
        int count = occurChar(s, c);
        System.out.println(count);
    }
}
