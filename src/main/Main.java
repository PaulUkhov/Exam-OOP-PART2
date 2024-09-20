package main;

import controller.CalculatorController;
import model.ModelNumber;
import model.Number;
import service.ArifmeticOperation;
import service.CheckOperand;
import service.GetOperand;
import view.View;

public class Main {
    public static void main(String[] args) {


        ArifmeticOperation arifmeticOperation = new ArifmeticOperation(0.0);
        View view = new View();
        CalculatorController controller = new CalculatorController(arifmeticOperation, view);

        controller.start();
    }
}
