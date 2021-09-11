package realty;

import inheritance.MainLecturer;
import inheritance.VisitingLecturer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    private List<RectangularPlot> rectangularPlots = new ArrayList<>();
    private List<SquarePlot> squarePlots = new ArrayList<>();
    private List<CirlePlot> cirlePlots = new ArrayList<>();

    public void input() { //(1) Nhập vào thông tin đất
        System.out.println("----------------------------" +
                "\nHình chữ nhật: 1" +
                "\nHình vuông: 2" +
                "\n----------------------------");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            RectangularPlot rectangularPlot = new RectangularPlot();
            rectangularPlot.input();
            this.rectangularPlots.add(rectangularPlot);
        }


        if (check == 2) {
            SquarePlot squarePlot = new SquarePlot();
            squarePlot.input();
            this.squarePlots.add(squarePlot);
        }



    }

    public void ouputOfRectangularPlot() {//(2) Xuất thông tin mảnh đất hình chữ nhật
        for (int i = 0; i < this.rectangularPlots.size(); i++) {
            System.out.println(this.rectangularPlots.get(i).toString());
        }

    }

    public void ouputOfSquarePlot() {//(2) Xuất thông tin mảnh đất hình chữ nhật
        for (int i = 0; i < this.rectangularPlots.size(); i++) {
            System.out.println(this.rectangularPlots.get(i).toString());
        }

    }

    public void ouputOfCirlePlot() {//(2) Xuất thông tin mảnh đất hình tron
        for (int i = 0; i < this.cirlePlots.size(); i++) {
            System.out.println(this.cirlePlots.get(i).toString());
        }

    }


    public double getAmmountOfRectangularPlot() {//(6) Tính tổng số tiền sở hữu đất hình chữ nhật
        double ammount = 0;
        for (int i = 0; i < this.rectangularPlots.size(); i++) {
            ammount += this.rectangularPlots.get(i).getAmmount();
        }
        return ammount;
    }

    public double getAmmountOfSquarePlot() {//(6) Tính tổng số tiền sở hữu đất hình vuong
        double ammount = 0;
        for (int i = 0; i < this.squarePlots.size(); i++) {
            ammount += this.squarePlots.get(i).getAmmount();
        }
        return ammount;
    }

    public double getAmmountOfCirclePlot() {//(6) Tính tổng số tiền sở hữu đất hình tron
        double ammount = 0;
        for (int i = 0; i < this.cirlePlots.size(); i++) {
            ammount += this.cirlePlots.get(i).getAmmount();
        }
        return ammount;
    }

    public double getAmmountOfAllPlot() {//(6) Tính tổng số tiền sở hữu đất
        double ammountTotal = 0;
        for (int i = 0; i < this.rectangularPlots.size(); i++) {
            ammountTotal += this.rectangularPlots.get(i).getAmmount();
        }
        for (int i = 0; i < this.squarePlots.size(); i++) {
            ammountTotal += this.squarePlots.get(i).getAmmount();
        }
        for (int i = 0; i < this.cirlePlots.size(); i++) {
            ammountTotal += this.cirlePlots.get(i).getAmmount();
        }
        return ammountTotal;
    }

}
