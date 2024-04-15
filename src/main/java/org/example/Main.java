package org.example;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 2);
        ComplexNumber num2 = new ComplexNumber(3, -4);

        ComplexCalculator addCalculator = ComplexCalculatorFactory.createCalculator(ComplexOperationType.ADDITION, num1, num2);
        ComplexNumber sum = addCalculator.calculate(num1, num2);
        System.out.println("Сумма: " + sum);

        ComplexCalculator multiplyCalculator = ComplexCalculatorFactory.createCalculator(ComplexOperationType.MULTIPLICATION, num1, num2);
        ComplexNumber product = multiplyCalculator.calculate(num1, num2);
        System.out.println("Произведение: " + product);

        ComplexCalculator divisionCalculator = ComplexCalculatorFactory.createCalculator(ComplexOperationType.DIVISION, num1, num2);
        ComplexNumber division = divisionCalculator.calculate(num1, num2);
        System.out.println("Деление: " + division);
    }
}