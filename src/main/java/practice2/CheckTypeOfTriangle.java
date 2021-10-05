package practice2;

import java.util.Scanner;

public class CheckTypeOfTriangle {
    //9. Nhập độ dài 3 cạnh. Kiểm tra đó có phải là tam giác không và là tam giác gì?

    public static boolean checkTriangle(float a, float b, float c) { //check xem 3 cạnh có tạo thành 1 tam giác không
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }

    public static String checkTypeTriangle(float a, float b, float c) {
        String type = "tam giac";

        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) { //check tam giac vuong
            type += " vuong";
        }

        if (a == b && a == c) {//check tam giác đều
            type += " deu";
        } else if (a == b || a == c || b == c) {//check tam giac can
            type += " can";
        }

        if (type.equals("tam giac")) { //check tam giac thuong
            type += " thuong";
        }
        return type;
    }

    public static void main(String[] args) {
        System.out.print("Nhap 3 canh a, b, c: ");
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        if (a > 0 && b > 0 && c > 0) {
            if (checkTriangle(a, b, c)) {
                String type = checkTypeTriangle(a, b, c);
                System.out.println(type);
            } else {
                System.out.println("3 canh KHONG tao thanh tam giac!");
            }
        } else {
            System.out.println("Khong phai do dai canh!");
        }
    }

}
