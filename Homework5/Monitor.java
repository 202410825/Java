package Homework;

public class Monitor {
    private String monitorSize;
    private  String color;
    private String power;

    public Monitor(String size, String col, String pow){
        this.monitorSize = size;
        this.color = col;
        this.power = pow;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + this.monitorSize);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}
