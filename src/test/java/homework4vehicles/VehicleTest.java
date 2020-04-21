package homework4vehicles;

import org.junit.Test;

public class VehicleTest {
    @Test
    public void testCar() {
        Car car = new Car(2.0);

        System.out.println(car);
        System.out.println("$" + car.costPer100km() + " per 100 km");
    }

    @Test
    public void testTruck() {
        Truck truck = new Truck(6.0);

        System.out.println(truck);
        System.out.println("$" + truck.costPer100km() + " per 100 km");
    }

    @Test
    public void testElectricCar() {
        ElectricCar electricCar = new ElectricCar(250);

        System.out.println(electricCar);
        System.out.println("$" + electricCar.costPer100km() + " per 100 km");
    }
}
