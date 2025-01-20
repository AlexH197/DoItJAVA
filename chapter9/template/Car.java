package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void washCar() {}        // 프레임 워크에서 많이 사용되는 설계 패턴

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드
    final  public void run() {
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
