package org.example;

import org.example.domain.Calculator;
import org.example.domain.PositiveNumber;
import org.example.ui.ConsoleInputUI;
import org.example.ui.ConsoleOutputUI;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        PositiveNumber operand1 = new PositiveNumber(ConsoleInputUI.enterOperand());
        String operator = ConsoleInputUI.enterOperator();
        PositiveNumber operand2 = new PositiveNumber(ConsoleInputUI.enterOperand());


        int result = Calculator.calculate(operand1, operator, operand2);


        ConsoleOutputUI.printResult(result);
    }
}
