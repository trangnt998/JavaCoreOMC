package practice2;

import java.util.Scanner;

public class Exercise4 {
    //4. Giải phương trình bậc hai ax2 + bx + c = 0.
    public static void main(String[] args) {
        System.out.print("Nhap he so a, b, c cua phuong trinh ax2 + bx + c: ");
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        float denta = b * b - 4 * a * c;
        if (a != 0) {
            if (denta > 0) {
                float dentaSqrt = (float) Math.sqrt(denta);
                float x1 = -b + dentaSqrt / (2.0F * a);
                float x2 = -b - dentaSqrt / (2.0F * a);
                System.out.println("x1 = " + x1 + "\nx2 =  " + x2);
            } else if (denta == 0) {
                float x = -b / (2.0F * a);
                System.out.println("x1 = x2 = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        } else {
            if (b != 0) {
                float x = -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem!");
                }
            }
        }

    }

}
