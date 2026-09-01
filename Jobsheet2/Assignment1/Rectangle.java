package Jobsheet2.Assignment1;

public class Rectangle {
    public int length;
    public int width;

    public void displayInfo(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public int getArea(){
        return length * width;
    }
    
    public int getCircumference(){
        return 2 * (length + width);
    }
}
