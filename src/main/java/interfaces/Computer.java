package interfaces;

public class Computer implements ElectricityConsumer {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void electricityOn() {
        System.out.println("I'm a computer");
        System.out.println("    I'm starting...");
        System.out.println("    I'm working...");
    }

    @Override
    public void electricityOff() {
        System.out.println("I'm a computer");
        System.out.println("    I'm closing OS...");
        System.out.println("    I'm off");
    }
}
