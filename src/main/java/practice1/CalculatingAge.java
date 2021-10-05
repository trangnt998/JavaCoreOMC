package practice1;

import java.util.Scanner;

public class CalculatingAge {
    public static void main(String[] args){
        System.out.print("Nhap nam sinh cua ban (la mot so >= 1890) va nhan Enter: ");
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        if(year>=2022 || year < 1890){
            System.out.println("Nam sinh ban nhap khong hop le!");
        }
        else {
            System.out.println("Tuoi cua ban la: " + (2021-year));
        }

    }
}
