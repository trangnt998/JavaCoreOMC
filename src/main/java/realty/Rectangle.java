package realty;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Point topLeft;
    private int width;
    private int height;

    public Rectangle(){
    }

    public Rectangle(Point topLeft, int width, int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public void input(){ //nhập thông tin
        super.input();
        System.out.println("Hình chữ nhật.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Tọa độ điểm trái trên: ");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();
        this.topLeft = new Point(x, y);

        System.out.print("Chiều dài: ");
        this.height = sc.nextInt();
        System.out.print("Chiều rộng: ");
        this.width = sc.nextInt();
    }

    public String toString(){ //xuất thông tin
        return super.toString() +
                "Hình chữ nhật: " +
                "\nĐiểm trái trên: " + this.topLeft.toString() +
                "\nChiều dài: " + this.height +
                "\nChiều rộng: " + this.width;
    }

    public double calculateArea(){ //tính diện tích
        return this.height * this.width;
    }
}
