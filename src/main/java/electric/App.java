package electric;

import java.util.Random;

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
        int n = 10;
        String[][] customer = new String[n][3]; //thông tin cá nhân khách hàng
        double[][] electricCustomer = new double[n][3]; //thông tin loại khách hàng, số điện
        double[][] electricBusiness = new double[n][3];//thông tin số điện dùng trong giờ thấp, trung và cao điểm

        Random random = new Random();

        for (int i = 0; i < customer.length; i++) {//tạo danh sách khách hàng để test
            customer[i][0] = "KH" + (i + 1); // ID
            customer[i][1] = "Nguyễn Văn A" + (i + 1);//name
            customer[i][2] = "096000000" + (i + 1)%10;//phone
            electricCustomer[i][0] = Math.floor(random.nextDouble() * 4000);//electricNumberPrevPeriod
            electricCustomer[i][1] = electricCustomer[i][0] + Math.floor(random.nextDouble() * 1000);//electricNumberThisPeriod
            electricBusiness[i][0] = Math.floor(random.nextDouble() * 1000);//idleElectricNumber
            electricBusiness[i][1] = Math.floor(random.nextDouble() * 1000);//nomalElectricNumber
            electricBusiness[i][2] = Math.floor(random.nextDouble() * 1000);//rushElectricNumber
        }

        for (int c = 0; c < n; c++) {
            if (c % 5 == 0) {//giả sử trường hợp test customerType: 0,1,2,3,4 lần lượt là khách lẻ, sỉ, doanh nghiệp cao, trung và thấp áp
                RetailCustomer retailCustomer = new RetailCustomer(customer[c][0], customer[c][1], customer[c][2], electricCustomer[c][0], electricCustomer[c][1]);
                System.out.println(retailCustomer.toString());
                System.out.println("Số tiền phải trả là: " + retailCustomer.calElectricBill() + " VNĐ");
                System.out.println("=========================================");
            } else if (c % 5 == 1) {
                WholesaleCustomer wholesaleCustomer = new WholesaleCustomer(customer[c][0], customer[c][1], customer[c][2], electricCustomer[c][0], electricCustomer[c][1]);
                System.out.println(wholesaleCustomer.toString());
                System.out.println("Số tiền phải trả là: " + wholesaleCustomer.calElectricBill() + " VNĐ");
                System.out.println("=========================================");
            } else if (c % 5 == 2) {
                BusinessCustomerHighPressure businessCustomerHighPressure = new BusinessCustomerHighPressure(customer[c][0], customer[c][1], customer[c][2],
                        electricBusiness[c][0], electricBusiness[c][1], electricBusiness[c][2]);
                System.out.println(businessCustomerHighPressure.toString());
                System.out.println("Số tiền phải trả là: " + businessCustomerHighPressure.calElectricBill() + " VNĐ");
                System.out.println("=========================================");
            } else if (c % 5 == 3) {
                BusinessCustomerMediumPressure businessCustomerMediumPressure = new BusinessCustomerMediumPressure(customer[c][0], customer[c][1], customer[c][2],
                        electricBusiness[c][0], electricBusiness[c][1], electricBusiness[c][2]);
                System.out.println(businessCustomerMediumPressure.toString());
                System.out.println("Số tiền phải trả là: " + businessCustomerMediumPressure.calElectricBill() + " VNĐ");
                System.out.println("=========================================");
            } else {
                BusinessCustomerLowPressure businessCustomerLowPressure = new BusinessCustomerLowPressure(customer[c][0], customer[c][1], customer[c][2],
                        electricBusiness[c][0], electricBusiness[c][1], electricBusiness[c][2]);
                System.out.println(businessCustomerLowPressure.toString());
                System.out.println("Số tiền phải trả là: " + businessCustomerLowPressure.calElectricBill() + " VNĐ");
                System.out.println("=========================================");
            }
        }

    }


}
