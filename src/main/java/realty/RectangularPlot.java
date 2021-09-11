package realty;

import java.util.Scanner;

public class RectangularPlot extends Plot{
    private int[] point = new int[2];
    private int hight;
    private int width;


    public RectangularPlot(){

    }

    public RectangularPlot(String nameOfPlot, double pricePerSquareMetter, int hight, int width){
        super(nameOfPlot,pricePerSquareMetter);
        this.hight = hight;
        this.width = width;
    }

    public void input(){ //ghi thông tin mảnh đất hinh chu nhat
        Scanner sc = new Scanner(System.in);
        System.out.format("Tọa độ điểm trái trên: ");
        this.point[0] = sc.nextInt();
        this.point[1] = sc.nextInt();

        super.input();
        System.out.print("Chiều dài: ");
        this.hight = sc.nextInt();
        System.out.print("Chiều rộng: ");
        this.width = sc.nextInt();
    }

    public String toString(){ // xuất thông tin mảnh đất hinh chu nhat
        return super.toString() +
                "\nĐiểm trái trên: (" + this.point[0] + "," + this.point[1] + ")" +
                "\nChiều dài: " + this.hight +
                "\nChiều rộng: " + this.width;
    }

    public double getArea(){ //tính diện tích mảnh đất hinh chu nhat
        return this.hight * this.width;
    }

    public double getAmmount(){ //tổng tiền phải trả cho mảnh đất
        return super.getAmmount();
    }
}
