package Problem1;
/**
 * This class models a point with x and y coordinates.
 */
public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
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

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return coordinates as an array
    public int[] getXY() {
        return new int[] { x, y };
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Method to calculate the distance to another point
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Method to calculate the distance to another MyPoint instance
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }
}
