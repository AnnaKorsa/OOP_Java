package HW7.service;

import HW7.logger.ILogger;
import HW7.model.ComplexNumber;

public class LogCalculator implements ICalculatorService{
    private final ICalculatorService decorated;
    private final ILogger logger;

    public LogCalculator(ICalculatorService decorated, ILogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызванный метод 'sum' со значениями real1 " + a.getReal() + " and imaginary1 " + a.getImag() + " real2 " +
                b.getReal() + " and imaginary2 " + b.getImag());
        return decorated.sum(a, b);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызванный метод 'multi' со значениями real1 " + a.getReal() + " and imaginary1 " + a.getImag() + " real2 " +
                b.getReal() + " and imaginary2 " + b.getImag());
        return decorated.multi(a, b);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызванный метод 'div' со значениями real1 " + a.getReal() + " and imaginary1 " + a.getImag() + " real2 " +
                b.getReal() + " and imaginary2 " + b.getImag());
        return decorated.div(a, b);
    }
}
