package electric;

//Khách mua điện sinh hoạt giá sỉ
public class WholesaleCustomer extends Customer {
    public WholesaleCustomer() {
    }

    public WholesaleCustomer(String ID, String name, String phone, double customerType,
                             double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        super(ID, name, phone, customerType, electricNumberPrevPeriod, electricNumberThisPeriod);
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nLoại khách hàng: Khách hàng mua điện sinh hoạt giá sỉ.";
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        double ammount = 0;
        double electricNumber = calElectricNumber();
        int level = 1;
        while (electricNumber > 0) {

            if (level == 6) {
                ammount += electricNumber
                        * LevelOfElectric.WholesaleLevelOfElectric.values()[level - 1].getPrice();
                break;
            }

            electricNumber -= LevelOfElectric.WholesaleLevelOfElectric.values()[level - 1].getLevel();
            ammount += LevelOfElectric.WholesaleLevelOfElectric.values()[level - 1].getLevel()
                    * LevelOfElectric.WholesaleLevelOfElectric.values()[level - 1].getPrice();
            level++;

        }
        return ammount + 0.1 * ammount;
    }
}
