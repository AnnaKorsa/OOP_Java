package HW7.factory;

import HW7.service.ICalculatorService;

public interface ICalculableFactory {
    ICalculatorService create();
}
