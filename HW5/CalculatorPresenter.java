package HW5;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view){
        this.model = model;
        this.view = view;
    }
    protected void performOperation(String operation, double num1, double num2){
        switch (operation){
            case "+":
                model.add(num1,num2);
                break;
            case "-":
                model.subtract(num1,num2);
                break;
            case "*":
                model.multiply(num1,num2);
                break;
            case "/":
                model.divide(num1,num2);
                break;
            default:
                System.out.println("Некорректная операция! ");

        }
        view.displayResult(model.getResult());
    }

    public void buttonClick(){
        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        performOperation(operation,num1,num2);

    }

}
