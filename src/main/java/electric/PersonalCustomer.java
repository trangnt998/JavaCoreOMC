package electric;

public abstract class PersonalCustomer extends Customer {
    private double electricNumberPrevPeriod;
    private double electricNumberThisPeriod;

    public PersonalCustomer() {
    }

    public PersonalCustomer(String ID, String name, String phone, double electricNumberPrevPeriod, double electricNumberThisPeriod) {
        super(ID, name, phone);
        this.electricNumberPrevPeriod = electricNumberPrevPeriod;
        this.electricNumberThisPeriod = electricNumberThisPeriod;
    }

    public String toString() { //xuất thông tin khách hàng
        return super.toString() +
                "\nSố điện kì trước: " + this.electricNumberPrevPeriod +
                "\nSố điện kì này: " + this.electricNumberThisPeriod +
                "\nSố điện sử dụng kì này: " + calElectricNumber();
    }

    public double calElectricNumber() { //tính số điện (kwh) sử dụng trong tháng
        return this.electricNumberThisPeriod - this.electricNumberPrevPeriod;
    }


    public double calElectricBill(int[] levelOfElectric, int[] priceOfElectric) { //tính số tiền điện phải trả
        //đầu vào là số điện mỗi bậc thang và giá mỗi bậc
        double ammount = 0;
        double electricNumber = calElectricNumber();

        int level = 1;
        while (electricNumber > 0) {

            if (level == 6) {
                ammount += electricNumber * priceOfElectric[level - 1];
                System.out.println(levelOfElectric[level - 1] * priceOfElectric[level - 1]);
                break;
            }

            electricNumber -= levelOfElectric[level - 1];
            if (electricNumber >= 0) {
                ammount += levelOfElectric[level - 1] * priceOfElectric[level - 1];
            }
            else {
                ammount += (electricNumber + levelOfElectric[level - 1]) * priceOfElectric[level - 1];
            }
            level++;
        }
        return ammount + 0.1 * ammount;
    }
}

