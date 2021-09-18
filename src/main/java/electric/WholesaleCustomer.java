package electric;

//Khách mua điện sinh hoạt giá sỉ
public class WholesaleCustomer extends PersonalCustomer {
    public WholesaleCustomer() {
    }

    public WholesaleCustomer(String ID, String name, String phone, double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        super(ID, name, phone, electricNumberPrevPeriod, electricNumberThisPeriod);
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nLoại khách hàng: Khách hàng mua điện sinh hoạt giá sỉ.";
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        int[] levelOfElectric = new int[6];
        int[] priceOfElectric = new int[6];

        for (int i = 0; i < 6; i++) {
            levelOfElectric[i] = LevelOfElectric.WholesaleLevelOfElectric.values()[i].getLevel();
            priceOfElectric[i] = LevelOfElectric.WholesaleLevelOfElectric.values()[i].getPrice();
        }

        return super.calElectricBill(levelOfElectric, priceOfElectric);
    }

}
