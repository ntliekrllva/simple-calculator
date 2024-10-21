package ru.nkirillova.calcapp._main;

import ru.nkirillova.calcapp.service.ResultWriterService;
import ru.nkirillova.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Calculator calc = new Calculator();
        int res;
        res = calc.sum(num1, num2);
        ResultWriterService.printResult("Сумма " + num1 + " и " + num2 + " = " + res);
        res = calc.subtract(num1, num2);
        ResultWriterService.printResult("Разность " + num1 + " и " + num2 + " = " + res);
        res = calc.multiply(num1, num2);
        ResultWriterService.printResult("Произведение " + num1 + " и " + num2 + " = " + res);
    }

}
