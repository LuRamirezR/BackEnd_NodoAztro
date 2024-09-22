package domain;

import model.Calculator;

public class PowerCalc extends Calculator {

    @Override
    public double operation(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
