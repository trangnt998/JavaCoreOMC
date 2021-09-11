package realty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plot {
    private double pricePerUnit;

    public Plot() {
    }

    public Plot(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setPricePerUnit() { //nhập giá đất
        System.out.println("Nhập giá đất: ");
        Scanner sc = new Scanner(System.in);
        this.pricePerUnit = sc.nextDouble();
    }

    private List<Rectangle> rectangles = new ArrayList<>();
    private List<Square> squares = new ArrayList<>();
    private List<Circle> circles = new ArrayList<>();
    private List<Triangle> triangles = new ArrayList<>();

    public void input() { //(1) Nhập vào thông tin đất
        System.out.println("----------------------------" +
                "\nHình chữ nhật: 1" +
                "\nHình vuông: 2" +
                "\nHình tròn: 3" +
                "\nHình tam giác: 4" +
                "\n----------------------------");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            Rectangle rectangle = new Rectangle();
            rectangle.input();
            this.rectangles.add(rectangle);
        }

        if (check == 2) {
            Square square = new Square();
            square.input();
            this.squares.add(square);
        }

        if (check == 3) {
            Circle circle = new Circle();
            circle.input();
            this.circles.add(circle);
        }

        if (check == 4) {
            Triangle triangle = new Triangle();
            triangle.input();
            this.triangles.add(triangle);
        }
    }

    public void ouputRectanglePlot() {//(2) Xuất thông tin mảnh đất hình chữ nhật
        for (int i = 0; i < this.rectangles.size(); i++) {
            System.out.println(this.rectangles.get(i).toString());
        }
    }

    public void ouputSquarePlot() {//(2) Xuất thông tin mảnh đất hình vuông
        for (int i = 0; i < this.squares.size(); i++) {
            System.out.println(this.squares.get(i).toString());
        }
    }

    public void ouputCirclePlot() {//(2) Xuất thông tin mảnh đất hình tròn
        for (int i = 0; i < this.circles.size(); i++) {
            System.out.println(this.circles.get(i).toString());
        }
    }

    public void ouputTrianglePlot() {//(2) Xuất thông tin mảnh đất hình tam giác
        for (int i = 0; i < this.triangles.size(); i++) {
            System.out.println(this.triangles.get(i).toString());
        }
    }

    public double getAmmountOfAllPlot() {//(6) Tính tổng số tiền sở hữu đất
        double ammountTotal = 0;
        for (int i = 0; i < this.rectangles.size(); i++) {
            ammountTotal += pricePerUnit * this.rectangles.get(i).calculateArea();
        }
        for (int i = 0; i < this.squares.size(); i++) {
            ammountTotal += pricePerUnit * this.squares.get(i).calculateArea();
        }
        for (int i = 0; i < this.circles.size(); i++) {
            ammountTotal += pricePerUnit * this.circles.get(i).calculateArea();
        }
        for (int i = 0; i < this.triangles.size(); i++) {
            ammountTotal += pricePerUnit * this.triangles.get(i).calculateArea();
        }
        return ammountTotal;
    }


}
