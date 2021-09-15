package electric;

import java.util.Arrays;

public class App {
    /*
    Các loại hình đăng ký điện gồm:
        Điện sinh hoạt giá bán lẻ
        Điện sinh hoạt giá bán sĩ
        Điện kinh doanh cao áp
        Điện kinh doanh trung áp
        Điện kinh doanh thấp áp
    */


    public static void main(String[] args) {

        RetailCustomer retailCustomer = new RetailCustomer("KH1", "Khach1", "0390000000", 1,
                1000, 2000);
        WholesaleCustomer wholesaleCustomer = new WholesaleCustomer("KH2", "Khach2", "0390000000", 2,
                1000, 2000);
        BusinessCustomerHighPressure businessCustomerHighPressure = new BusinessCustomerHighPressure("KH3", "Khach3", "0390000000", 3,
                1000, 2000, 50, 50, 900);
        BusinessCustomerMediumPressure businessCustomerMediumPressure = new BusinessCustomerMediumPressure("KH4", "Khach4", "0390000000", 4,
                1000, 2000, 50, 50, 900);
        BusinessCustomerLowPressure businessCustomerLowPressure = new BusinessCustomerLowPressure("KH5", "Khach5", "0390000000", 5,
                1000, 2000, 50, 50, 900);

        System.out.println("Số tiền phải trả là: " + retailCustomer.calElectricBill() + " VNĐ");
        System.out.println("Số tiền phải trả là: " + wholesaleCustomer.calElectricBill() + " VNĐ");
        System.out.println("Số tiền phải trả là: " + businessCustomerHighPressure.calElectricBill() + " VNĐ");
        System.out.println("Số tiền phải trả là: " + businessCustomerMediumPressure.calElectricBill() + " VNĐ");
        System.out.println("Số tiền phải trả là: " + businessCustomerLowPressure.calElectricBill() + " VNĐ");

    }


}
