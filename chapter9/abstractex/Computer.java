package abstractex;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Turning on the computer");
    }
    public void turnOff() {
        System.out.println("Turning off the computer");
    }
}
