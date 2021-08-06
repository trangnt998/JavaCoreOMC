package practice1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap diem thi mon Toan: ");
        float toan = in.nextFloat();
        System.out.print("Nhap he so mon Toan: ");
        float cof_toan = in.nextFloat();

        System.out.print("Nhap diem thi mon Ly: ");
        float ly = in.nextFloat();
        System.out.print("Nhap he so mon Ly: ");
        float cof_ly = in.nextFloat();

        System.out.print("Nhap diem thi mon Hoa: ");
        float hoa = in.nextFloat();
        System.out.print("Nhap he so mon Hoa: ");
        float cof_hoa = in.nextFloat();

        if((toan >= 0 && toan <= 10 && cof_toan > 0) && (ly >= 0 && ly <= 10 &&
                cof_ly > 0) && (hoa >= 0 && hoa <= 10 && cof_hoa > 0)){
            float avg = (toan*cof_toan + ly*cof_ly +hoa*cof_hoa)/(cof_toan + cof_hoa + cof_ly);
            System.out.print("Diem trung binh mon cua hoc sinh la: " + avg );
        }
        else {
            System.out.print("Diem thi hoac he so khong hop le!");
        }

    }
}
