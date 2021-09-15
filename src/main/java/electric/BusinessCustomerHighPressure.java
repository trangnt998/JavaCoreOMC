package electric;

//Khách mua điện kinh doanh cao áp
public class BusinessCustomerHighPressure extends Customer {

    private double idleElectricNumber; //số điện dùng trong giờ thấp điểm
    private double nomalElectricNumber; //số điện dùng trong giờ trung điểm
    private double rushElectricNumber; //số điện dùng trong giờ cao điểm

    public BusinessCustomerHighPressure() {
    }

    public BusinessCustomerHighPressure(String ID, String name, String phone, int customerType,
                                        double electricNumberPrevPeriod, double electricNumberThisPeriod,
                                        double idleElectricNumber, double nomalElectricNumber, double rushElectricNumber) {
        super(ID, name, phone, customerType, electricNumberPrevPeriod, electricNumberThisPeriod);
        this.idleElectricNumber = idleElectricNumber;
        this.nomalElectricNumber = nomalElectricNumber;
        this.rushElectricNumber = rushElectricNumber;
    }

    public double calElectricBill() {//tính số tiền điện phải trả
        double ammount = 0;
        double electricNumber = calElectricNumber();

        double[] typeElectricNumber = new double[3];
        typeElectricNumber[0] = idleElectricNumber;
        typeElectricNumber[1] = nomalElectricNumber;
        typeElectricNumber[2] = rushElectricNumber;

        if (electricNumber == (this.idleElectricNumber + this.nomalElectricNumber + this.rushElectricNumber)) { //nếu tổng số điện = số điện thành phần
            for (int i = 0; i < LevelOfElectric.BusinessLevelOfHigh.values().length; i++) {
                typeElectricNumber[i] =
                        ammount += typeElectricNumber[i] * LevelOfElectric.BusinessLevelOfHigh.values()[i].getPrice();
            }

        }

        return ammount + 0.1 * ammount;
    }

}
