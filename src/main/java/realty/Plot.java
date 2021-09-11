package realty;

import java.util.Scanner;

public class Plot {
    private String nameOfPlot;
    private int[] point = new int[2];
    private double pricePerSquareMetter;
    public Plot(){
    }

    public Plot(String nameOfPlot, double pricePerSquareMetter){
        this.nameOfPlot = nameOfPlot;
        this.pricePerSquareMetter = pricePerSquareMetter;
    }

    public void input(){ //ghi thông tin mảnh đất
        Scanner sc = new Scanner(System.in);

        System.out.format("Tọa độ điểm trái trên: ");
        this.point[0] = sc.nextInt();
        this.point[1] = sc.nextInt();

        System.out.print("Giá đất / mét vuông: ");
        this.pricePerSquareMetter = sc.nextDouble();
    }

    public String toString(){ // xuất thông tin mảnh đất
        return "\nLoại mảnh đất: " + this.nameOfPlot +
                "\nĐiểm trái trên: " + this.point +
                "\nGiá đất / mét vuông: " + this.pricePerSquareMetter;
    }

    public double getArea(){ //tính diện tích mảnh đất
        return 0;
    }

    public double getAmmount(){ //tổng tiền phải trả cho mảnh đất
        return this.pricePerSquareMetter * this.getArea();
    }
}
