// Java QAP 2
// Author: Nicholas Power
// Date: February 13, 2025

package Problem1;

public class MyLine {
    private MyPoint begin; 
    private MyPoint end;   

    // Constructor with coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor with MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter for begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter for end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Get length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Get gradient (angle in radians)
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // String representation of the line
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
