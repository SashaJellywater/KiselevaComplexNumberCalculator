package org.example;

public class MultiplicationCalculator extends AbstractComplexCalculator {
    public MultiplicationCalculator(ComplexNumber num1, ComplexNumber num2) {
        super(num1, num2);
    }

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryResult = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
