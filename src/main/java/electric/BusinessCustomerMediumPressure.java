package electric;

public class BusinessCustomerMediumPressure extends BusinessCustomer {
    public BusinessCustomerMediumPressure() {
    }

    public BusinessCustomerMediumPressure(String ID, String name, String phone,
                                          double idleElectricNumber, double nomalElectricNumber, double rushElectricNumber) {
        super(ID, name, phone, idleElectricNumber, nomalElectricNumber, rushElectricNumber);
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nLoại khách hàng: Khách hàng mua điện kinh doanh trung áp.";
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        int[] priceOfLevelBusiness = new int[3];
        for (int i = 0; i < 3; i++) {
            priceOfLevelBusiness[i] = LevelOfElectric.BusinessLevelOfMedium.values()[i].getPrice();
        }

        return super.calElectricBill(priceOfLevelBusiness);
    }
}
