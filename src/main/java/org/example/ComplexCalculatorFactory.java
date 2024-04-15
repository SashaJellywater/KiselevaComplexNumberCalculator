package org.example;

public class ComplexCalculatorFactory {
    public static ComplexCalculator createCalculator(ComplexOperationType operationType, ComplexNumber num1, ComplexNumber num2) {
        switch (operationType) {
            case ADDITION:
                return new AdditionCalculator(num1, num2);
            case MULTIPLICATION:
                return new MultiplicationCalculator(num1, num2);
            case DIVISION:
                return new DivisionCalculator(num1, num2);
            default:
                throw new IllegalArgumentException("Unsupported operation type");
        }
    }
}
