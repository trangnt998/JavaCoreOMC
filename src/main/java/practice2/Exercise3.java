package practice2;

import java.util.Scanner;

public class Exercise3 {
    //3. Giải phương trình bậc nhất ax + b = 0.
    public static void main(String[] args) {
        System.out.print("Nhap he so a va b cua phuong trinh bac nhat ax + b = 0: ");
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();

        if (a != 0) {
            float x = -b / a;
            System.out.println("Nghiem la: x = " + x);
        } else if (b != 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else {
            System.out.println("Phuong trinh vo so nghiem!");
        }


    }
}
