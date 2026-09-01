package Jobsheet2.Assignment1;

public class DemoRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;

        r1.displayInfo();
        System.out.println("Area: " + r1.getArea());
        System.out.println("Circumference: " + r1.getCircumference());
    }
}
