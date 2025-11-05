package Homework;

public class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String mem, String hd, String col, String pow){
        this.cpu = cpu;
        this.memory = mem;
        this.hd = hd;
        this.color = col;
        this.power = pow;
    }

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + this.cpu);
        System.out.println("Memory: " + this.memory );
        System.out.println("HDD: " + this.hd);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power );
    }

}
