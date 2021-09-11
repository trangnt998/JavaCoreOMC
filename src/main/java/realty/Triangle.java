package realty;

import realty.Point;
import realty.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void input() { //nhập thông tin
        super.input();
        System.out.println("Hình tam giác.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Tọa độ 3 điểm: ");

        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();
        this.point1 = new Point(x1, y1);

        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();
        this.point2 = new Point(x2, y2);

        System.out.print("x3 = ");
        int x3 = sc.nextInt();
        System.out.print("y3 = ");
        int y3 = sc.nextInt();
        this.point3 = new Point(x3, y3);
    }

    public String toString() { //xuất thông tin
        return super.toString() +
                "Hình tam giác: " +
                "\nĐỉnh 1: " + this.point1.toString() +
                "\nĐỉnh 2: " + this.point2.toString() +
                "\nĐỉnh 3: " + this.point3.toString();
    }

    public double calculateArea() { //tính diện tích
        return (double) 1 / 2 * Math.abs((this.point2.getX() - this.point1.getX())
                * (this.point3.getY() - this.point1.getY())
                - (this.point3.getX() - this.point1.getX())
                * (this.point2.getY() - this.point1.getY()));
    }
}

