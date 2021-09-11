package realty;

import java.util.Scanner;

public class SquarePlot extends Plot{
    private int[] point = new int[2];
    private int width;

    public SquarePlot(){

    }

    public SquarePlot(String nameOfPlot, double pricePerSquareMetter, int width){
        super(nameOfPlot,pricePerSquareMetter);
        this.width = width;
    }

    public void input(){ //ghi thông tin mảnh đất hinh vuong
        Scanner sc = new Scanner(System.in);
        System.out.format("Tọa độ điểm trái trên: ");
        this.point[0] = sc.nextInt();
        this.point[1] = sc.nextInt();
        super.input();
        System.out.print("Chiều rộng: ");
        this.width = sc.nextInt();
    }

    public String toString(){ // xuất thông tin mảnh đất hinh vuong
        return super.toString() +
                "\nĐiểm trái trên: (" + this.point[0] + "," + this.point[1] + ")"  +
                "\nChiều rộng: " + this.width;
    }

    public double getArea(){ //tính diện tích mảnh đất hinh chu nhat
        return this.width * this.width;
    }

    public double getAmmount(){ //tổng tiền phải trả cho mảnh đất
        return super.getAmmount();
    }
}

