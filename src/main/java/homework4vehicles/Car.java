package homework4vehicles;

public class Car extends Vehicle {

    public Car(double engineVolume) {
        super(engineVolume);
    }

    @Override
    public double costPer100km() {
        double fuelConsumptionLitresPer100km = 5 * getEngineVolume();

        return fuelConsumptionLitresPer100km * Vehicle.fuelPrice1L;
    }

    @Override
    public String toString() {
        return "Car {" +
                "engineVolume = " + super.getEngineVolume() +
                '}';
    }
}
