package realty;

import java.util.Scanner;

public class Circle extends Shape {
    private Point centerPoint;
    private int radius;

    public Circle(){
    }

    public Circle(Point centerPoint, int radius){
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public void input(){ //nhập thông tin
        super.input();
        System.out.println("Hình tròn.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Tọa độ tâm: ");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();
        this.centerPoint = new Point(x, y);

        System.out.print("Bánh kính: ");
        this.radius = sc.nextInt();
    }

    public String toString(){ //xuất thông tin
        return super.toString() +
                "Hình tròn: " +
                "\nTọa độ tâm: " + this.centerPoint.toString() +
                "\nBánh kính: " + this.radius;
    }

    public double calculateArea(){ //tính diện tích
        return Math.PI * this.radius * this.radius;
    }
}


