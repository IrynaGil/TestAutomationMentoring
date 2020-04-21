package homework4humans;

public class Girl extends Woman {
    private int childAge;

    public Girl(double height, double weight, int age) {
        super(height, weight);
        this.childAge = age;
    }

    @Override
    public double idealWeight() {
        if (childAge <= 10) {
            return (10 + 2 * (childAge - 1));
        } else {
            return (30 + 4 * (childAge - 10));
        }
    }

    @Override
    public String weightEstimation() {
        String res = "";

        double idealWeight = this.idealWeight();

        if (this.getWeight() == idealWeight) {
            res = "Congrats! Current weight is ideal";
        } else if (this.getWeight() > idealWeight) {
            res = (this.getWeight() - idealWeight) + " overweight!";
        } else {
            res = (idealWeight - this.getWeight() + " underweight!");
        }

        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Girl {height: ");
        sb.append(this.getHeight());
        sb.append(", weight: ");
        sb.append(this.getWeight());
        sb.append(", age: ");
        sb.append(this.childAge);
        sb.append("}");
        return sb.toString();
    }
}
