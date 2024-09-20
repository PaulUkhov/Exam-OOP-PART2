package service;

import model.Number;
import model.Operation;

import java.util.logging.Logger;

//Воспроизводит последовательность и логику работы между элементами 
public class CheckOperand  extends ArifmeticOperation  implements checkOperation{
    public static final Logger logger = Logger.getLogger(CheckOperand.class.getName());

    public CheckOperand(Double number) {
        super(number);
    }


    public void checkOperand(char operation) {
        System.out.println("Введите первое число:");
        // Ввод первого числа
       double  result = getNumber();
        logger.info("Первое число: " + result);
        while (true) {
            System.out.println("Введите оператор (+, *, /) или = для завершения:");
            // Запрос и проверка оператора
          char operate = operation;


            if (operate == '=') {
                logger.info("Завершение программы");
                // Завершение работы программы
                break;
            }
            System.out.println("Введите следующее число:");
            // Ввод следующего числа
            double nextNumber = getNumber();
            logger.info("Следующее число: " + result);

            // Обработка операций
            switch (operation) {
                case '+':
                    result = add(result,nextNumber);
                    logger.info("Результат сложения: " + result);
                    break;
                default:
                    System.out.println("Ошибка: введите корректный оператор.");
                    logger.warning("Некорректный оператор: " + operation);
                    continue;// Продолжаем к следующей итерации цикла
            }
            System.out.println("Текущий результат: ");
        }
    }


    @Override
    public double checkNumber(String prompt) {
        return 0;
    }

    @Override
    public void checkOperation(String prompt) {

    }
}


