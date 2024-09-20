package view;

import java.util.Scanner;

public class View  implements viewBihavior {
    private final Scanner scanner = new Scanner(System.in);

    public double getNumber(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите корректное число.");
            scanner.next(); // очищаем ввод
        }
        return scanner.nextDouble();
    }

    public char getOperation(String prompt) {
        System.out.println(prompt);
        while (true) {
            String input = scanner.nextLine();

            if (input.length() == 1) {
                if (prompt == "+") {
                    scanner.next();
                }
                System.out.println("Ошибка");
                scanner.next();
            }

            return scanner.next().charAt(0);
        }
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}
