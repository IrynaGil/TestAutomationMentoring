package homework4humans;

/**
 * Написать абстрактный класс человек
 * от него наследники мужчина и женщина.
 * У них должны быть в конструкторе рост и вес,
 * реализованы метод расчета идеального веса,
 * определение насколько соответствует (больше или меньше идеального веса конкретный экземпляр),
 * и сколько нужно набрать/скинуть до идеального веса.
 * Потом сделать двух наследников мальчик и девочка
 * в которых эти методы будут переопределены (@Override).
 * Все расчёты и запуск вычислений написать в тесте (используя аннотацию @Test)
 */

public abstract class Human {
    private double height;
    private double weight;

    public Human(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public abstract double idealWeight();

    public abstract String weightEstimation();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
