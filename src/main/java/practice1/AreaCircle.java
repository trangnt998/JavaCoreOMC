package practice1;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh duong tron: R = ");
        float R = in.nextFloat();

        if(R > 0){
            System.out.println("Chu vi duong tron ban kinh R = "+ R + " la: " + (2*R*Math.PI));
            System.out.println("Dien tich hinh tron ban kinh R = "+ R + " la: " + (R*R*Math.PI));
        }
        else {
            System.out.print("Ban kinh duong tron phai la so duong!");
        }

    }
}
