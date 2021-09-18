package electric;

public class BusinessCustomerLowPressure extends BusinessCustomer {

    public BusinessCustomerLowPressure() {
    }

    public BusinessCustomerLowPressure(String ID, String name, String phone,
                                       double idleElectricNumber, double nomalElectricNumber, double rushElectricNumber) {
        super(ID, name, phone, idleElectricNumber, nomalElectricNumber, rushElectricNumber);
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nLoại khách hàng: Khách hàng mua điện kinh doanh thấp áp.";
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        int[] priceOfLevelBusiness = new int[3];
        for (int i = 0; i < 3; i++) {
            priceOfLevelBusiness[i] = LevelOfElectric.BusinessLevelOfLow.values()[i].getPrice();
        }

        return super.calElectricBill(priceOfLevelBusiness);
    }
}
