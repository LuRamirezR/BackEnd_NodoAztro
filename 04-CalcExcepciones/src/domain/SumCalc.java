package domain;

import model.Calculator;

public class SumCalc extends Calculator {

    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
