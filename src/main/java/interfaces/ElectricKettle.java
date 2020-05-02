package interfaces;

public class ElectricKettle implements ElectricityConsumer {
    private double power;

    public ElectricKettle(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void electricityOn() {
        System.out.println("I'm an electric kettle.");
        System.out.println("    I'm on...!");
        System.out.println("    started to boil...");
        System.out.println("    take a minute...");
        System.out.println("    water is boiled!");
        System.out.println("    I'm switching to off mode!");
    }

    @Override
    public void electricityOff() {
        System.out.println("I'm an electric kettle.");
        System.out.println("    I'm off...!");
    }
}
