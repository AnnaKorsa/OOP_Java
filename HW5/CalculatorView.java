package HW5;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }
    public void displayResult(double result){
        System.out.printf("Результат %.2f\n", result);
    }
    public String getOperation(){
        System.out.println("Введите операцию (+, -, *, /) ");
        return scanner.nextLine();
    }
    public double getOperand(){
        System.out.println("Введите дробное число,разделенное '.'(Например: 2.1): ");
        return Double.parseDouble(scanner.nextLine());/* парсим строку в double*/
    }
}
