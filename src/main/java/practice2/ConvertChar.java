package practice2;

import java.util.Scanner;

public class ConvertChar {
    //2. Nhập một chữ cái. Nếu là chữ thường thì đổi sang chữ hoa, ngược lại đổi sang chữ thường.

    public static void main(String[] args) {
        System.out.print("Nhap 1 chu cai: ");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char character = str.charAt(0);

        char convert;
        if (str.length() == 1) { //length == 1 có nghĩa rằng phần tử nhập vào là 1 chữ cái
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (Character.isUpperCase(character)) {
                    convert = Character.toLowerCase(character);
                } else {
                    convert = Character.toUpperCase(character);
                }
                System.out.println(convert);
            }
        } else {
            System.out.println("Sai du lieu!");
        }
    }
}
