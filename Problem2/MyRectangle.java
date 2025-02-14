package Problem2;

import Problem1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for topLeft
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Getter for bottomRight
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Compute width
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Compute height
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Compute area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Compute perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // String representation
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
