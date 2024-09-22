package domain;

import model.Calculator;

public class RestCalc extends Calculator {

    //Override the operation method to perform the subtraction
    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
