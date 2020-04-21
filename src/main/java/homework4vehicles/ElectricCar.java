package homework4vehicles;

public class ElectricCar extends Car {
    private double enginePower;
    public static final double electricityPrice1kWh = 0.1331; //in $ in USA at 04/15/2020

    public ElectricCar(double enginePower) {
        super(0);

        this.enginePower = enginePower;
    }

    @Override
    public double costPer100km() {
        double electricityConsumptionkWhPer100km = enginePower / 12.5;

        return electricityConsumptionkWhPer100km * electricityPrice1kWh;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Electric car {" +
                "enginePower = " + this.getEnginePower() +
                '}';
    }
}
