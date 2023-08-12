package HW7.factory;

import HW7.logger.ILogger;
import HW7.service.Calculator;
import HW7.service.ICalculatorService;
import HW7.service.LogCalculator;

public class CalculableLoggerFactory implements ICalculableFactory {
    private final ILogger logger;

    public CalculableLoggerFactory(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public ICalculatorService create() {
        return new LogCalculator(new Calculator(), logger);
    }
}
