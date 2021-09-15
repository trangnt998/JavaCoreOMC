package electric;

import inheritance.Main;

public class LevelOfElectric {
    enum RetailLevelOfElectric { //enum của bậc điện sinh hoạt bán lẻ
        LEVEL1(50, 1678),
        LEVEL2(50, 1734),
        LEVEL3(100, 2014),
        LEVEL4(100, 2536),
        LEVEL5(100, 2834),
        LEVEL6(2927);

        private int level;
        private int price;

        private RetailLevelOfElectric(int level, int price) {
            this.level = level;
            this.price = price;
        }

        private RetailLevelOfElectric(int price) {
            this.price = price;
        }

        private RetailLevelOfElectric() {
        }

        public int getLevel() {
            return level;
        }

        public int getPrice() {
            return price;
        }
    }

    enum WholesaleLevelOfElectric { //enum của bậc điện sinh hoạt bán sỉ
        LEVEL1(50, 1403),
        LEVEL2(50, 1459),
        LEVEL3(100, 1590),
        LEVEL4(100, 1971),
        LEVEL5(100, 2231),
        LEVEL6(2323);

        private int level;
        private int price;

        private WholesaleLevelOfElectric(int level, int price) {
            this.level = level;
            this.price = price;
        }

        private WholesaleLevelOfElectric(int price) {
            this.price = price;
        }

        private WholesaleLevelOfElectric() {
        }

        public int getLevel() {
            return level;
        }

        public int getPrice() {
            return price;
        }
    }

    enum BusinessLevelOfHigh { //enum của điện kinh doanh cao áp
        IDLE_HOUR(1361), //giờ thấp điểm
        NOMAL_HOUR(2442), //Giờ bình thường
        RUSH_HOUR(4251); //giờ cao điểm


        private int price;

        private BusinessLevelOfHigh() {
        }

        private BusinessLevelOfHigh(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    enum BusinessLevelOfMedium { //enum của điện kinh doanh trung áp
        IDLE_HOUR(1547), //giờ thấp điểm
        NOMAL_HOUR(2629), //Giờ bình thường
        RUSH_HOUR(4400); //giờ cao điểm


        private int price;

        private BusinessLevelOfMedium() {
        }

        private BusinessLevelOfMedium(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    enum BusinessLevelOfLow { //enum của điện kinh doanh thấp áp
        IDLE_HOUR(1622), //giờ thấp điểm
        NOMAL_HOUR(2666), //Giờ bình thường
        RUSH_HOUR(4587); //giờ cao điểm


        private int price;

        private BusinessLevelOfLow() {
        }

        private BusinessLevelOfLow(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
