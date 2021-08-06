package practice1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String name = in.nextLine();
        System.out.print("Nhap so luong san pham: ");
        int count = in.nextInt();
        System.out.print("Nhap don gia san pham, don vi vnd: ");
        int price = in.nextInt();

        if(count > 0 && price >= 0){
            System.out.println("Tien hang: " + (count*price) + " vnd");
            System.out.println("VAT: " + ((count*price)*0.1) + " vnd");
        }
        if(count <= 0){
            System.out.println("So luong san pham phai la mot so nguyen duong!");
        }
        if(price < 0){
            System.out.println("Tien hang phai la so khong am!");
        }



    }
}
