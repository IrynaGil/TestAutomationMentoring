package homework4humans;


public class Woman extends Human {
    public Woman(double height, double weight) {
        super(height, weight);
    }

    @Override
    public double idealWeight() {
        return (this.getHeight() * 100 - 110) * 1.15;
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
        StringBuilder sb = new StringBuilder("Woman {height: ");
        sb.append(this.getHeight());
        sb.append(", weight: ");
        sb.append(this.getWeight());
        sb.append("}");
        return sb.toString();
    }
}
