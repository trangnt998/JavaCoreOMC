package realty;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("===================================================" +
                "\n(1) Nhập vào thông tin các mảnh đất" +
                "\n(2) Xuất thông tin mảnh đất hình chữ nhật" +
                "\n(3) Xuất thông tin mảnh đất hình vuông" +
                "\n(4) Xuất thông tin mảnh đất hình tròn" +
                "\n(5) Xuất thông tin mảnh đất hình tam giác" +
                "\n(6) Tính số tiền." +
                "\n====================================================");

        System.out.println("Thực hiện chương trình: nhấn Y. \nThoát chương trình: nhấn N.");
        Scanner sc = new Scanner(System.in);
        String confirmation = sc.nextLine();

        Plot plot = new Plot();

        while (confirmation.equals("Y")) {
            System.out.print("Chọn hành động: ");
            int action = sc.nextInt();

            if (action == 1) {
                plot.input();
            }
            if (action == 2) {
                plot.ouputRectanglePlot();
            }
            if (action == 3) {
                plot.ouputSquarePlot();
            }
            if (action == 4) {
                plot.ouputCirclePlot();
            }
            if (action == 3) {
                plot.ouputTrianglePlot();
            }
            if (action == 6) {
                plot.setPricePerUnit();
                System.out.println("Tổng tiền cần chi trả: " + plot.getAmmountOfAllPlot());
            }

            System.out.println("Tiếp tục: Y/N?");
            Scanner sc1 = new Scanner(System.in);
            confirmation = sc1.nextLine();
        }

    }
}
