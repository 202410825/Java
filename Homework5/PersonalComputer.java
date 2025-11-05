package Homework;

public class PersonalComputer {
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(){
        this.computer = new Computer("Core i7","32GC","2TB","흰색", "700W");
        this.monitor = new Monitor("32인치","검은색","45W");
    }

    public void turnOn(){
        this.computer.turnOn();
        this.monitor.turnOn();
    }

    public void printInfo(){
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}
