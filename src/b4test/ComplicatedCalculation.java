package b4test;

/**
 * Created by Eitan on 17/12/2017.
 */
public class ComplicatedCalculation extends SimpleCalculation {
    int parameter;

    public ComplicatedCalculation(int parameter) {
        super(parameter);
        this.parameter = parameter + (2 * super.parameter);
    }

    public String calculate() {
        return "In ComplicatedCalculation class: " + parameter;
    }
}
