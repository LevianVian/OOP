package Jobsheet2.Assignment2;

public class LampDemo {
    public static void main(String[] args) {
        Lamp philipsLamp = new Lamp("Philips", 15.0f, "Cool White", "LED Bulb");
        Lamp bardiLamp = new Lamp("Bardi Smart Bulb", 9.0f, "RGB", "Smart LED");

        philipsLamp.turnOn(50);
        philipsLamp.adjustBrightness(25); 
        philipsLamp.displayStatus();

        bardiLamp.turnOn(100);
        bardiLamp.adjustBrightness(-40);
        bardiLamp.turnOff();
        bardiLamp.adjustBrightness(10);
        bardiLamp.displayStatus();
    }
}