package Problem1;

public class MyPoint {
    private int x; 
    private int y; 

    // Constructor to initialize point with given coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x-coordinate
    public int getX() {
        return x;
    }

    // Setter for x-coordinate
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y-coordinate
    public int getY() {
        return y;
    }

    // Setter for y-coordinate
    public void setY(int y) {
        this.y = y;
    }

    // Returns distance to another point
    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Returns string representation of the point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
