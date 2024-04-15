package org.example;

public abstract class AbstractComplexCalculator implements ComplexCalculator {
    protected ComplexNumber num1;
    protected ComplexNumber num2;

    public AbstractComplexCalculator(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
