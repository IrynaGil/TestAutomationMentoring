package interfaces;

import java.util.ArrayList;
import java.util.List;

public class PowerSource {
    private int id;

    private List<ElectricityConsumer> electricityConsumers = new ArrayList();

    public void plugConsumer(ElectricityConsumer electricityConsumer) {
        electricityConsumers.add(electricityConsumer);
    }

    public void unplugConsumer(ElectricityConsumer electricityConsumer) {
        electricityConsumers.remove(electricityConsumer);
    }

    public void switchOn() {
        for (ElectricityConsumer electricityConsumer : electricityConsumers) {
            electricityConsumer.electricityOn();
        }
    }

    public void switchOff() {
        for (ElectricityConsumer electricityConsumer : electricityConsumers) {
            electricityConsumer.electricityOff();
        }
    }

    public PowerSource(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
