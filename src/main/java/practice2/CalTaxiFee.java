package practice2;

import java.util.Scanner;

public class CalTaxiFee {
    /*
    7. Tính tiền đi taxi từ số km nhập vào. Biết:
        a. 1 km đầu giá 15000đ
        b. Từ km thứ 2 đến km thứ 5 giá 13500đ
        c. Từ km thứ 6 trở đi giá 11000đ
        d. Nếu trên 120km được giảm 10% tổng tiền.
     */

    public static float calTaxiFee(float distance) {
        float fee = 0;
        if (distance <= 1) {
            fee = 15000;
            return fee;
        } else if (distance <= 5) {
            fee = 15000 + 13500 * (distance - 1);
            return fee;
        } else {
            fee = 15000 + 13500 * (distance - 1) + 11000 * (distance - 5);
        }

        if (distance > 120) {
            fee = fee - 0.1F * fee;
        }

        return fee;
    }

    public static void main(String[] args) {
        System.out.print("Nhap km: ");
        Scanner in = new Scanner(System.in);

        float distance = in.nextFloat();

        if (distance >= 0) {
            float fee = calTaxiFee(distance);
            System.out.println("So tien can tra la: " + fee + " vnd");
        } else {
            System.out.println("Khong hop le!");
        }

    }
}
