package Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line = new MyLine(p1, p2);

        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + Math.toDegrees(line.getGradient()) + " degrees");
    }
}
