package Problem1;

/**
 * Test driver to test all the public methods in the MyLine class.
 */
public class TestMyLine {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create MyLine instances
        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(3, 4, 7, 1);

        // Test the MyLine class methods
        System.out.println(line1); // Expected output: MyLine[begin=(1,2), end=(4,6)]
        System.out.println(line2); // Expected output: MyLine[begin=(3,4), end=(7,1)]

        // Test getters and setters
        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 3));
        System.out.println(line1); // Expected output: MyLine[begin=(0,0), end=(3,3)]

        line2.setBeginXY(2, 3);
        line2.setEndXY(5, 7);
        System.out.println(line2); // Expected output: MyLine[begin=(2,3), end=(5,7)]

        // Test length calculation
        System.out.println("Length of line1: " + line1.getLength()); // Expected output: 4.242640687119285
        System.out.println("Length of line2: " + line2.getLength()); // Expected output: 5.0

        // Test gradient calculation
        System.out.println("Gradient of line1: " + line1.getGradient()); // Expected output: 0.7853981633974483 (45
                                                                         // degrees in radians)
        System.out.println("Gradient of line2: " + line2.getGradient()); // Expected output: 0.7853981633974483 (45
                                                                         // degrees in radians)

        // Test begin and end point getters
        System.out.println("Line1 begin point: " + line1.getBegin()); // Expected output: (0,0)
        System.out.println("Line1 end point: " + line1.getEnd()); // Expected output: (3,3)
        System.out.println("Line2 begin point: " + line2.getBegin()); // Expected output: (2,3)
        System.out.println("Line2 end point: " + line2.getEnd()); // Expected output: (5,7)

        // Test coordinate getters
        System.out.println("Line1 begin X: " + line1.getBeginX()); // Expected output: 0
        System.out.println("Line1 begin Y: " + line1.getBeginY()); // Expected output: 0
        System.out.println("Line1 end X: " + line1.getEndX()); // Expected output: 3
        System.out.println("Line1 end Y: " + line1.getEndY()); // Expected output: 3
    }
}
