package realty;

public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString(){ //Hiển thị tọa độ điểm
        return "(x,y) = (" + this.x + "," + this.y + ")";
    }
}
