package homework4vehicles;

public class Truck extends Vehicle {

    public Truck(double engineVolume) {
        super(engineVolume);
    }

    @Override
    public double costPer100km() {
        double fuelConsumptionLitresPer100km = 8.5 * getEngineVolume();

        return fuelConsumptionLitresPer100km * Vehicle.fuelPrice1L;
    }

    @Override
    public String toString() {
        return "Truck {" +
                "engineVolume = " + super.getEngineVolume() +
                '}';
    }
}
