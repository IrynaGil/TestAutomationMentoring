package interfaces;

public class ElectricLamp implements ElectricityConsumer {
    private double power;

    public ElectricLamp(double power) {
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
        System.out.println("I'm an electric lamp");
        System.out.println("    I'm on with all of my " + power + " watt");
    }

    @Override
    public void electricityOff() {
        System.out.println("I'm an electric lamp");
        System.out.println("    I'm off");
    }
}
