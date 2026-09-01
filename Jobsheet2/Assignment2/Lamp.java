package Jobsheet2.Assignment2;

public class Lamp{
    private String brand;
    private float maximumWatts;
    private String typeOfLumens;
    private String typeOfLamp;
    private boolean isTurnedOn;
    private int currentBrightness;

    public Lamp(String brand, float maximumWatts, String typeOfLumens, String typeOfLamp){
        this.brand = brand;
        this.maximumWatts = maximumWatts;
        this.typeOfLumens = typeOfLumens;
        this.typeOfLamp = typeOfLamp;
        this.isTurnedOn = false;
        this.currentBrightness = 0;
    }

    public void turnOn(int initialBrightness){
        if (!isTurnedOn){
            this.isTurnedOn = true;
            this.currentBrightness = Math.max(0, Math.min(100, initialBrightness));
            System.out.println("Lamp " + brand + " is turned on with brightness: " + this.currentBrightness + "%");
        } else {
            System.out.println("Lamp " + brand + " currently on");    
        }
    }

    public void turnOff(){
        if (isTurnedOn){
            this.isTurnedOn = false;
            this.currentBrightness = 0;
            System.out.println("Lamp " + brand + " is turned off");
        }
    }

    public void adjustBrightness(int incrementAmount){
        if (isTurnedOn){
            this.currentBrightness += incrementAmount;
            this.currentBrightness = Math.max(0, Math.min(100, this.currentBrightness));
            System.out.println("Lamp " + brand + " brightness adjusted to: " + this.currentBrightness + "%");
        } else {
            System.out.println("Lamp " + brand + " faied to adjust brightness");
        }
    }
    
   public void displayStatus() {
        System.out.println("Brand         : " + brand);
        System.out.println("Power         : " + (isTurnedOn ? "ON" : "OFF"));
        System.out.println("Brightness    : " + currentBrightness + "%");
        System.out.println("Spesification : " + typeOfLamp + ", " + typeOfLumens + ", " + maximumWatts + "W");
    }
}