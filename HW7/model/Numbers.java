package HW7.model;

import java.util.Scanner;

public class Numbers {
    private final Double a;
    private final Double b;
    private final Double c;
    private final Double d;

    public Numbers(Double a, Double b, Double c, Double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static Numbers askNumbers(Scanner sc) {
        System.out.print("Введите значение a: ");
        double a = sc.nextDouble();
        System.out.print("Введите значение b: ");
        double b = sc.nextDouble();
        System.out.print("Введите значение c: ");
        double c = sc.nextDouble();
        System.out.print("Введите значение d: ");
        double d = sc.nextDouble();

        return new Numbers(a, b, c, d);
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public Double getD() {
        return d;
    }
}
