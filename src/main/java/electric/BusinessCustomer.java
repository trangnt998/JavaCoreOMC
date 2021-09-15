package electric;

//Khách mua điện kinh doanh
public abstract class BusinessCustomer extends Customer {

    private double idleElectricNumber; //số điện dùng trong giờ thấp điểm
    private double nomalElectricNumber; //số điện dùng trong giờ trung điểm
    private double rushElectricNumber; //số điện dùng trong giờ cao điểm

    public BusinessCustomer() {
    }

    public BusinessCustomer(String ID, String name, String phone, double customerType,
                            double electricNumberPrevPeriod, double electricNumberThisPeriod,
                            double idleElectricNumber, double nomalElectricNumber, double rushElectricNumber) {
        super(ID, name, phone, customerType, electricNumberPrevPeriod, electricNumberThisPeriod);
        this.idleElectricNumber = idleElectricNumber;
        this.nomalElectricNumber = nomalElectricNumber;
        this.rushElectricNumber = rushElectricNumber;
    }

    public double getIdleElectricNumber() {
        return idleElectricNumber;
    }

    public double getNomalElectricNumber() {
        return nomalElectricNumber;
    }

    public double getRushElectricNumber() {
        return rushElectricNumber;
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nSố điện dùng trong giờ thấp điểm: " + this.idleElectricNumber +
                "\nSố điện dùng trong giờ trung điểm: " + this.nomalElectricNumber +
                "\nSố điện dùng trong giờ cao điểm: " + this.rushElectricNumber;
    }


    public abstract double calElectricBill();//tính số tiền điện phải trả


}
