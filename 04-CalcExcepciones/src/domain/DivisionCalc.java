package domain;

import model.Calculator;

public class DivisionCalc extends Calculator {
    @Override
    public double operation(double num1, double num2) {
        if (num2 == 0){
            throw new ArithmeticException("Division por cero");
        }
        return num1 / num2;
    }
}
