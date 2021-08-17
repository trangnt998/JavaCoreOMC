package practice_string;

import java.util.Scanner;

public class ExerciseString12347 {
    /*
    1. In uppercase từ chuỗi nhập vào
    2. In kí tự không phải là số từ chuỗi nhập vào
    3. Số lần xuất hiện của kí tự c trong chuỗi nhập vào s
    4. Nhập một chuỗi kí tự, đếm số lượng các từ trong chuỗi kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng)
    7. Đếm số lượng ký tự nguyên âm và phụ âm xuất hiện trong chuỗi. Ví dụ chuỗi java có 2 nguyên âm a, 2 phụ âm j và v.
     */

    public static String printUppercase(String s) { //in ra chu in hoa
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result += c;
            }
        }
        return result;
    }

    public static String printNonNumeric(String s) {  //in ra ki tu khong phai la so
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

    public static int occurChar(String s, char c) { //dem so lan xuat hien cua c trong s
        int count = 0;
        char c1;
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            if (Character.toString(c1).equals(Character.toString(c))) {
                count++;
            }
        }
        return count;
    }

    public static int countWord(String s) { //dem so tu trong chuoi
        String[] str = s.split("\\s+");
        return str.length;
    }

    public static int[] countVowelConsonant(String s) { //dem nguyen am, phu am
        int countVowel = 0;
        int countConsonant = 0;

        char c;
        String strUpper = s.toUpperCase();

        char[] arrVowel = {'U', 'E', 'O', 'A', 'I'};

        for (int i = 0; i < strUpper.length(); i++) {
            c = strUpper.charAt(i);

            int check = 0;
            for (char value : arrVowel) {
                if (Character.toString(c).equals(Character.toString(value))) {
                    countVowel++;
                    check = 1; //check = 1 neu ki tu la nguyen am
                    break;
                }
            }

            if (Character.isUpperCase(c) && check == 0) {
                countConsonant++;
            }
        }
        return new int[]{countVowel, countConsonant};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        System.out.println("Uppercase: " + printUppercase(s));

        System.out.println("Non-numeric: " + printNonNumeric(s));

        System.out.print("Nhap ki tu c: ");
        String str = sc.nextLine();
        char c = str.charAt(0);
        int count = occurChar(s, c);
        System.out.println("So la xuat hien " + c + " la: " + count);

        System.out.println("So tu trong chuoi: " + countWord(s));

        int[] result = countVowelConsonant(s);
        System.out.println("Vowel = " + result[0] +
                "\nConsonant = " + result[1]);

    }
}
