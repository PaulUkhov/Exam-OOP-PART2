package service;

import model.ModelNumber;
import model.Number;

//Арифметические операции, взаимодейтсвие между элементами
public class ArifmeticOperation extends Number implements calcBihavior {


    public ArifmeticOperation(Double number) {
        super(number);
    }

    @Override
    public double add(double firstNum, double secondNum){
        return firstNum + firstNum;

    }



//    @Override
//    public double multiply(){
//        double multiply = number.getNumber() * number.getNumber();
//        return multiply;
//    }
//
//    @Override
//    public double divide() {
//        double divide = number.getNumber() / number.getNumber();
//        return divide;
//    }
//    @Override
//    public double multiply(Number number) {
//        return number.getFirstNumber() * number.getSecondNumber();
//    }
//    @Override
//    public double divide(Number number) {
//        if (number.getSecondNumber() == 0) {
//            System.out.println("Ошибка: деление на ноль.");
//            return number.getFirstNumber();
//        }
//        return number.getFirstNumber() / number.getSecondNumber();
//    }
}

