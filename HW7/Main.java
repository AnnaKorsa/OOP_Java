package HW7;

import HW7.factory.CalculableLoggerFactory;
import HW7.factory.ICalculableFactory;
import HW7.logger.ILogger;
import HW7.logger.LoggerConsole;
import HW7.view.CalculatorView;
import HW7.view.ConsoleCalculatorView;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new LoggerConsole();
        ICalculableFactory calculableFactory = new CalculableLoggerFactory(logger);
        CalculatorView calculatorView = new ConsoleCalculatorView(calculableFactory);

        calculatorView.run();
    }
}
