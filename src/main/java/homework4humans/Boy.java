package homework4humans;

public class Boy extends Man {

    public Boy(double height, double weight) {
        super(height, weight);
    }

    @Override
    public double idealWeight() {
        return (this.getHeight() * 100 - 100) * 1.1;
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
        StringBuilder sb = new StringBuilder("Boy {height: ");
        sb.append(this.getHeight());
        sb.append(", weight: ");
        sb.append(this.getWeight());
        sb.append("}");
        return sb.toString();
    }
}
