package HW7.view;

import HW7.factory.ICalculableFactory;
import HW7.model.ComplexNumber;
import HW7.model.Numbers;
import HW7.service.ICalculatorService;

import java.text.NumberFormat;
import java.util.Scanner;

public class ConsoleCalculatorView implements CalculatorView {
    private final ICalculableFactory calculableFactory;

    public ConsoleCalculatorView(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        ICalculatorService calculator = calculableFactory.create();

        System.out.println("""
                Для расчета необходимо выбрать операцию:
                Сумма: +
                Умножение: *
                Деление: /"""
        );

        String val = sc.nextLine();
        NumberFormat nf = NumberFormat.getInstance();

        switch (val) {
            case "+" -> {
                System.out.println("(a + bi) + (c + di)");
                Numbers numbers = Numbers.askNumbers(sc);
                ComplexNumber num1 = new ComplexNumber(numbers.getA(), numbers.getB());
                ComplexNumber num2 = new ComplexNumber(numbers.getC(), numbers.getD());
                ComplexNumber result = calculator.sum(num1, num2);

                System.out.printf("(%s + %si) + (%s + %si) = %s%n", nf.format(numbers.getA()), nf.format(numbers.getB()),
                        nf.format(numbers.getC()), nf.format(numbers.getD()), result.toString());
            }
            case "*" -> {
                System.out.println("(a + bi) * (c + di)");
                Numbers numbers = Numbers.askNumbers(sc);
                ComplexNumber num1 = new ComplexNumber(numbers.getA(), numbers.getB());
                ComplexNumber num2 = new ComplexNumber(numbers.getC(), numbers.getD());
                ComplexNumber result = calculator.multi(num1, num2);

                System.out.printf("(%s + %si) * (%s + %si) = %s%n", nf.format(numbers.getA()), nf.format(numbers.getB()),
                        nf.format(numbers.getC()), nf.format(numbers.getD()), result.toString());
            }
            case "/" -> {
                System.out.println("(a + bi) / (c + di)");
                Numbers numbers = Numbers.askNumbers(sc);
                ComplexNumber num1 = new ComplexNumber(numbers.getA(), numbers.getB());
                ComplexNumber num2 = new ComplexNumber(numbers.getC(), numbers.getD());
                ComplexNumber result = calculator.div(num1, num2);

                System.out.printf("(%s + %si) / (%s + %si) = %s%n", nf.format(numbers.getA()), nf.format(numbers.getB()),
                        nf.format(numbers.getC()), nf.format(numbers.getD()), result.toString());
            }
            default -> System.out.println("Ошибка! Операция не найдена");
        }
    }
}
