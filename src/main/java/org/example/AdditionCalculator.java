package org.example;

public class AdditionCalculator extends AbstractComplexCalculator {
    public AdditionCalculator(ComplexNumber num1, ComplexNumber num2) {
        super(num1, num2);
    }
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getReal() + num2.getReal();
        double imaginaryResult = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
