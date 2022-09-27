public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }

    public double distance(int x, int y) {
        return  Math.sqrt((this.getX() - x) * (this.getX() - x) + (this.getY() - y) * (this.getY() - y));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }



}
