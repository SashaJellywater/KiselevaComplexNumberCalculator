package org.example;

public class DivisionCalculator extends AbstractComplexCalculator {
    public DivisionCalculator(ComplexNumber num1, ComplexNumber num2) {
        super(num1, num2);
    }

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double divisor = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realResult = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / divisor;
        double imaginaryResult = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / divisor;
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
