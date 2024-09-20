package service;

import model.Operation;

import java.util.Scanner;

public class GetOperand extends Operation implements getOperations{
    public GetOperand(char operation) {
        super(operation);
    }

    // Метод для получения и проверки оператора
    public char getOperation(String prompt) {
        Scanner scanner = new Scanner(System.in);
        char operation;
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim(); // Чтение строки и удаление лишних пробелов
            if (input.length() == 1) {
                operation = input.charAt(0);
                if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '=') {
                    break;
                } else {
                    System.out.println("Ошибка: введите корректный оператор (+, -, *, /) или =.");
                }
            } else {
                System.out.println("Ошибка: введите один символ.");
            }
        }
        return operation;
    }
}
