package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 4);
        MyPoint bottomRight = new MyPoint(5, 1);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        MyRectangle rectangle2 = new MyRectangle(2, 6, 8, 2);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
