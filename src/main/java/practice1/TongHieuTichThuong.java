package practice1;

import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = in.nextDouble();
        System.out.print("Nhap b: ");
        double b = in.nextDouble();

        System.out.println("Tong 2 so a va b la: " + a + " + " + b +" = " + (a+b));
        System.out.println("Hieu 2 so a va b la: "+ a + " - " + b +" = " +(a-b));
        System.out.println("Tich 2 so a va b la: "+ a + " * " + b +" = " +(a*b));

        if(b!=0) {
            System.out.println("Thuong 2 so a va b la: " + a + " / " + b + " = " + (a / b));
        }
        else {
            System.out.println("Khong thuc hien phep chia co so chia = 0!");
        }

    }
}
