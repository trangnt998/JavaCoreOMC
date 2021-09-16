package electric;

//Khách mua điện kinh doanh cao áp
public class BusinessCustomerHighPressure extends BusinessCustomer {

    public BusinessCustomerHighPressure() {
    }

    public BusinessCustomerHighPressure(String ID, String name, String phone, double customerType,
                                        double idleElectricNumber, double nomalElectricNumber, double rushElectricNumber) {
        super(ID, name, phone, customerType, idleElectricNumber, nomalElectricNumber, rushElectricNumber);
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nLoại khách hàng: Khách hàng mua điện kinh doanh cao áp.";
    }


    public double calElectricBill() {//tính số tiền điện phải trả
        double ammount = 0;

        double[] typeElectricNumber = new double[3];
        typeElectricNumber[0] = getIdleElectricNumber();
        typeElectricNumber[1] = getNomalElectricNumber();
        typeElectricNumber[2] = getRushElectricNumber();

        for (int i = 0; i < LevelOfElectric.BusinessLevelOfHigh.values().length; i++) {
            ammount += typeElectricNumber[i] * LevelOfElectric.BusinessLevelOfHigh.values()[i].getPrice();
        }

        return ammount + 0.1 * ammount;
    }

}
