package electric;

//Khách mua điện sinh hoạt giá lẻ
public class RetailCustomer extends Customer {
    public RetailCustomer() {
    }

    public RetailCustomer(String ID, String name, String phone, int customerType,
                          double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        super(ID, name, phone, customerType, electricNumberPrevPeriod, electricNumberThisPeriod);
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        double ammount = 0;
        double electricNumber = calElectricNumber();
        int level = 1;
        while (electricNumber > 0) {

            if (level == 6) {
                ammount += electricNumber
                        * LevelOfElectric.RetailLevelOfElectric.values()[level - 1].getPrice();
                break;
            }

            electricNumber -= LevelOfElectric.RetailLevelOfElectric.values()[level - 1].getLevel();
            ammount += LevelOfElectric.RetailLevelOfElectric.values()[level - 1].getLevel()
                    * LevelOfElectric.RetailLevelOfElectric.values()[level - 1].getPrice();
            level++;

        }
        return ammount + 0.1 * ammount;
    }


}