package b4test;

/**
 * Created by Eitan on 17/12/2017.
 */
public class SimpleCalculation extends Calculation {
    int parameter;

    public SimpleCalculation(int parameter) {
        super(parameter);
        this.parameter = parameter + super.parameter;
    }

    public String calculate() {
        return "In SimpleCalculation class: " + parameter;
    }

}
