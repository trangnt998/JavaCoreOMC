package realty;

import java.util.Scanner;

public class Square extends Shape {
    private Point topLeft;
    private int width;

    public Square(){
    }

    public Square(Point topLeft, int width){
        this.topLeft = topLeft;
        this.width = width;
    }

    public void input(){ //nhập thông tin
        super.input();
        System.out.println("Hình vuông.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Tọa độ điểm trái trên: ");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();
        this.topLeft = new Point(x, y);

        System.out.print("Chiều rộng: ");
        this.width = sc.nextInt();
    }

    public String toString(){ //xuất thông tin
        return super.toString() +
                "Hình vuông: " +
                "\nĐiểm trái trên: " + this.topLeft.toString() +
                "\nChiều rộng: " + this.width;
    }

    public double calculateArea(){ //tính diện tích
        return this.width * this.width;
    }
}

