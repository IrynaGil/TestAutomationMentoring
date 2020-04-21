package homework4vehicles;

/**
 * Написать абстрактный класс машина у него есть параметр: объём двигателя.
 * От него наследники грузовой автомобиль и легковой автомобиль -
 * у них по какой-то упрощённой формуле расчитывается расход денег на топливо в расчёте на 100 км.
 * От легковой автомобиль наследуется электромобиль в котором есть параметр мощность -
 * в нём переопределить метод расчёта (используя параметр мощность).
 * Все расчёты и запуск вычислений написать в тесте (используя аннотацию @Test)
 */

public abstract class Vehicle {
    public static final double fuelPrice1L = 1.851; //in $ in USA at 04/15/2020

    private double engineVolume;

    public Vehicle(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract double costPer100km();

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
