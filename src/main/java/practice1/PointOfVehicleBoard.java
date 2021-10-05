package practice1;

import java.util.Scanner;

public class PointOfVehicleBoard {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so xe cua ban: ");
        String xe = in.nextLine();
        int n = Integer.parseInt(xe);

        if(n >= 0 && xe.length() <= 5){
            int point = 0;
            int d = 10;
            for (int i = 1; i <= 5; i++){
                point += n % (d);
                n = n / 10;
            }
            if(point >= 10){
                point = point%10;
            }
            System.out.print("So xe cua ban duoc: " + point + " nut.");
        }
        else {
            System.out.print("Nhap so xe khong dung yeu cau!");
        }


    }
}
