package interfaces;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ElectricKettle electricKettle = new ElectricKettle(100);
        Computer computer = new Computer("Dell");
        ElectricLamp electricLamp1 = new ElectricLamp(50);
        ElectricLamp electricLamp2 = new ElectricLamp(150);

        PowerSource powerSource = new PowerSource(1);
        powerSource.plugConsumer(electricKettle);
        powerSource.plugConsumer(computer);
        powerSource.plugConsumer(electricLamp1);
        powerSource.plugConsumer(electricLamp2);

        powerSource.switchOn();

        powerSource.switchOff();


    }

}
