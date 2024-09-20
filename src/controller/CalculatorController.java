package controller;

import model.Number;
import service.ArifmeticOperation;
import view.View;

import java.util.logging.Logger;

public class CalculatorController {
    private final ArifmeticOperation arifmeticOperation;
    private final View view;
    private final Logger logger =  Logger.getLogger(CalculatorController.class.getName());
    public CalculatorController(ArifmeticOperation arifmeticOperation, View view) {
        this.arifmeticOperation = arifmeticOperation;
        this.view = view;
    }

    public void start() {
        double result = view.getNumber("Введите первое число:");
        logger.info("Первое число: " + result);
        while (true) {
            char operation;

            // Цикл для получения корректного оператора
            while (true) {
                operation = view.getOperation("Введите оператор (+) или = для завершения:");
                if (operation == '=') {
                    logger.info("Завершение программы");
                    view.displayResult(result);
                    return; // Завершаем метод
                }

                // Проверка корректности оператора
                if (operation == '+' ) {
                    break; // Выходим из цикла, если оператор корректный
                } else {
                    view.displayMessage("Ошибка: некорректный оператор. Попробуйте еще раз.");
                    logger.warning("Некорректный ввод оператора: " + operation);
                }
            }

            double nextNumber = view.getNumber("Введите следующее число:");
            logger.info("Следующее число: " + nextNumber);

            switch (operation) {
                case '+':
                    result = arifmeticOperation.add(result,nextNumber);
                    break;
                default:
                    view.displayMessage("Ошибка: некорректный оператор.");
                    logger.warning("Неккоректный ввод");
            }

            view.displayResult(result);
        }
    }
}
