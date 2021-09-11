package realty;

import java.util.Scanner;

public class CirlePlot extends Plot{
    private int[] point = new int[2];
    private int radius;

    public CirlePlot(){

    }

    public CirlePlot(String nameOfPlot, double pricePerSquareMetter, int radius){
        super(nameOfPlot,pricePerSquareMetter);
        this.radius = radius;
    }

    public void input(){ //ghi thông tin mảnh đất hinh tron
        Scanner sc = new Scanner(System.in);
        System.out.format("Tọa độ tâm: ");
        this.point[0] = sc.nextInt();
        this.point[1] = sc.nextInt();
        super.input();
        System.out.print("Bán kính: ");
        this.radius = sc.nextInt();
    }

    public String toString(){ // xuất thông tin mảnh đất hinh tron
        return super.toString() +
                "\nTọa độ tâm: (" + + this.point[0] + "," + this.point[1] + ")"  +
                "\nBán kính: " + this.radius;
    }

    public double getArea(){ //tính diện tích mảnh đất hinh chu tron
        return (double) Math.PI*this.radius * this.radius;
    }

    public double getAmmount(){ //tổng tiền phải trả cho mảnh đất
        return super.getAmmount();
    }
}


