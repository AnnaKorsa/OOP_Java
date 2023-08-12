package HW7.factory;

import HW7.service.Calculator;
import HW7.service.ICalculatorService;

public class CalculableFactory implements ICalculableFactory {
    public ICalculatorService create() {
        return new Calculator();
    }
}
