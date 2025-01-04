package cooperation;

public class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;

    public Taxi(int TaxiNumber) {
        this.taxiNumber = TaxiNumber;
    }
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("택시 " + taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money +"입니다.");
    }
}
